package com.furia.furiabot.furia;

import com.furia.furiabot.furia.buttonHandler.FuriaButtonHandler;
import com.furia.furiabot.furia.messages.FuriaMessages;
import com.furia.furiabot.furia.resposta.FuriaResposta;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class FuriaBot extends TelegramLongPollingBot {

    private static final String BOT_TOKEN = "8067549518:AAEmBGh_hlSXd0x8Gwe218wq97NoX1PP10o";
    private static final String BOT_USERNAME = "furia_nation_bot";

    private final FuriaButtonHandler buttonHandler = new FuriaButtonHandler();

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = update.getMessage();
            String texto = message.getText();
            long chatId = message.getChatId();

            SendMessage resposta;
            if (texto.equals("informacoes_furia")) {
                resposta = buildResponseMessage(chatId, "Escolha uma opção:");
                resposta.setReplyMarkup(buttonHandler.getInlineKeyboard());
            } else {
                resposta = buildResponseMessage(chatId, "Comando não reconhecido. Digite 'informacoes_furia' para ver as opções.");
            }

            try {
                execute(resposta);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

        if (update.hasCallbackQuery()) {
            String callbackData = update.getCallbackQuery().getData();
            long chatId = update.getCallbackQuery().getMessage().getChatId();

            try {
                // Substituindo a chamada para a OpenAIClient
                String response = FuriaResposta.getResposta(callbackData);
                SendMessage resposta = buildResponseMessage(chatId, response);
                execute(resposta);
            } catch (Exception e) {
                e.printStackTrace();
                SendMessage errorResponse = buildResponseMessage(chatId, "Erro ao tentar buscar a resposta. Tente novamente mais tarde.");
                try {
                    execute(errorResponse);
                } catch (TelegramApiException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    private SendMessage buildResponseMessage(long chatId, String text) {
        SendMessage resposta = new SendMessage();
        resposta.setChatId(String.valueOf(chatId));
        resposta.setText(text);
        return resposta;
    }
}
