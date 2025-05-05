package com.furia.furiabot.furia;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MainBot {
    public static void main(String[] args) {

        try {
            // Crie uma instância do TelegramBotsApi com o contexto da API
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);

            // Inicializa o bot FuriaBot
            FuriaBot bot = new FuriaBot();

            // Registra o bot
            telegramBotsApi.registerBot(bot);

            System.out.println("FuriaBot iniciado com sucesso!");

        } catch (TelegramApiException e) {
            e.printStackTrace();
            System.out.println("Erro ao iniciar o FuriaBot: " + e.getMessage());
        }
    }
}
