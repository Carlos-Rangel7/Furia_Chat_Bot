package com.furia.furiabot.furia.resposta;


public class FuriaResposta {

    public static String getResposta(String opcao) {
        switch (opcao) {
            case "informacoes_furia":
                return "A FURIA Esports foi fundada em 2017 e é uma das maiores organizações de esports do Brasil. " +
                        "Eles competem em jogos como CS2, Valorant, League of Legends (LoL), e Rainbow Six Siege. " +
                        "Com uma base de fãs crescente e jogadores altamente competitivos, a FURIA continua a " +
                        "impressionar no cenário internacional com seu estilo de jogo agressivo e determinado.";

            case "jogadores_cs2":
                return "A FURIA possui um elenco de estrelas no CS2, incluindo jogadores como: \n" +
                        "- FalleN (AWPer); \n" +
                        "- Yuurih (Rifler); \n" +
                        "- KSCERATO (Rifler); \n" +
                        "- Art (In-game Leader); \n" +
                        "- Drop (Substituto). \n" +
                        "Além disso, a equipe é comandada pelo técnico, FURY. O destaque da equipe é Yuurih, conhecido por suas jogadas agressivas.";

            case "jogadores_valorant":
                return "O time de Valorant da FURIA é composto por jogadores de grande habilidade, como: \n" +
                        "- mwzera (Duelista); \n" +
                        "- furyy (Controlador); \n" +
                        "- Sashimi (Sentinela); \n" +
                        "- Khalil (Duelista). \n" +
                        "Recentemente, o time se destacou por suas classificações consistentes nos campeonatos, como o Masters Reykjavik 2022.";

            case "ultimo_jogo":
                return "O último jogo da FURIA no CS2 foi contra a equipe Natus Vincere no campeonato BLAST Premier. A FURIA venceu com um placar de 2-1, com Art fazendo jogadas chave como líder do time.";

            case "proximo_jogo":
                return "O próximo jogo da FURIA será contra a equipe G2 no campeonato ESL Pro League. O jogo será no formato BO3 e ocorrerá no dia 1 de maio às 18h (GMT-3). O jogo será transmitido ao vivo no canal oficial da ESL.";

            case "historico":
                return "A FURIA foi fundada em 2017 e, desde então, se tornou uma das maiores organizações de esports no Brasil. " +
                        "O time de CS2 é o mais popular, mas a FURIA também se expandiu para outros jogos como Valorant e Rainbow Six Siege. " +
                        "A equipe tem participado de torneios de prestígio, como os Majors de CS2.";

            case "titulos":
                return "Os principais títulos da FURIA incluem: \n" +
                        "CS2: 2º lugar no IEM Katowice 2022; \n" +
                        "Valorant: Masters Reykjavik 2022 (Campeões); \n" +
                        "Rainbow Six Siege: Pro League - Season 9 (Campeões).";

            case "redes_sociais":
                return "Você pode seguir a FURIA nas seguintes plataformas: \n" +
                        "- Twitter: @FURIA; \n" +
                        "- Instagram: @FURIAesports; \n" +
                        "- TikTok: @FURIAesports; \n" +
                        "- YouTube: FURIA Esports; \n" +
                        "- Twitch: @FURIAesports.";

            case "loja":
                return "Você pode comprar produtos oficiais da FURIA na loja online: \n" +
                        "- Camisetas personalizadas; \n" +
                        "- Mouses e teclados com a marca FURIA; \n" +
                        "Acesse a loja em: https://www.furiaesports.store.";

            case "calendario":
                return "Próximos torneios da FURIA: \n" +
                        "- IEM Cologne 2023 (CS2) - de 5 a 9 de junho; \n" +
                        "- Valorant Champions Tour 2023 - de 20 a 25 de maio; \n" +
                        "Times confirmados: G2, Cloud9, Liquid.";

            default:
                return "Opção não reconhecida. Tente novamente ou digite um comando válido.";
        }
    }
}
