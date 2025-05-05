package com.furia.furiabot.furia.buttonHandler;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class FuriaButtonHandler {

    public InlineKeyboardMarkup getInlineKeyboard() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Informações sobre a FURIA");
        button1.setCallbackData("informacoes_furia");

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Jogadores CS2");
        button2.setCallbackData("jogadores_cs2");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Jogadores Valorant");
        button3.setCallbackData("jogadores_valorant");

        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Último Jogo");
        button4.setCallbackData("ultimo_jogo");

        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Próximo Jogo");
        button5.setCallbackData("proximo_jogo");

        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Histórico");
        button6.setCallbackData("historico");

        InlineKeyboardButton button7 = new InlineKeyboardButton();
        button7.setText("Títulos");
        button7.setCallbackData("titulos");

        InlineKeyboardButton button8 = new InlineKeyboardButton();
        button8.setText("Redes Sociais");
        button8.setCallbackData("redes_sociais");

        InlineKeyboardButton button9 = new InlineKeyboardButton();
        button9.setText("Loja");
        button9.setCallbackData("loja");

        InlineKeyboardButton button10 = new InlineKeyboardButton();
        button10.setText("Calendário");
        button10.setCallbackData("calendario");

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(button1);
        row1.add(button2);
        row1.add(button3);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        row2.add(button4);
        row2.add(button5);
        row2.add(button6);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        row3.add(button7);
        row3.add(button8);
        row3.add(button9);

        List<InlineKeyboardButton> row4 = new ArrayList<>();
        row4.add(button10);

        // Organizando as linhas de botões
        keyboard.add(row1);
        keyboard.add(row2);
        keyboard.add(row3);
        keyboard.add(row4);

        inlineKeyboardMarkup.setKeyboard(keyboard);

        return inlineKeyboardMarkup;
    }

}
