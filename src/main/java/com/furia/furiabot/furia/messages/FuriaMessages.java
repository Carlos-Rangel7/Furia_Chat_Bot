package com.furia.furiabot.furia.messages;

public class FuriaMessages {

    public static final String INFO_FURIA =
            "Forneça uma visão geral sobre a FURIA Esports, incluindo:\n" +
                    "- Ano de fundação e origem;\n" +
                    "- Principais jogos (CS2, Valorant, LoL) e conquistas;\n" +
                    "- Impacto no cenário brasileiro e internacional;\n" +
                    "- Estilo de jogo característico (ex.: 'Furia Style' no CS2).\n" +
                    "Mantenha a resposta em 2 parágrafos. Limite de 1000 caracteres.";

    public static final String JOGADORES_CS2 =
            "Liste o elenco atual da FURIA no CS2, incluindo:\n" +
                    "- Nicks e nomes reais dos jogadores;\n" +
                    "- Funções em jogo (entry fragger, AWPer, etc.);\n" +
                    "- Técnico e analistas.\n" +
                    "Destaque o jogador mais emblemático. Limite de 1000 caracteres.";

    public static final String JOGADORES_VALORANT =
            "Liste o elenco atual da FURIA no Valorant, incluindo:\n" +
                    "- Nicks e agentes principais;\n" +
                    "- Posições (controlador, duelista, etc.);\n" +
                    "- Histórico recente (ex.: últimas classificações). Limite de 1000 caracteres.";

    public static final String ULTIMO_JOGO =
            "Descreva o último jogo da FURIA no [jogo: CS2/Valorant], incluindo:\n" +
                    "- Adversário, campeonato e fase;\n" +
                    "- Resultado final e placar;\n" +
                    "- Destaques (MVP, jogadas decisivas).\n" +
                    "Se não houver dados, informe claramente. Limite de 1000 caracteres.";

    public static final String PROXIMO_JOGO =
            "Informe sobre o próximo compromisso da FURIA, incluindo:\n" +
                    "- Jogo (CS2/Valorant), adversário e formato (BO3/BO5);\n" +
                    "- Data, horário (em GMT-3) e onde assistir;\n" +
                    "- Contexto (ex.: final de torneio, classificação). Limite de 1000 caracteres.";

    public static final String HISTORICO =
            "Resuma a história da FURIA Esports, destacando:\n" +
                    "- Fundação e primeiros anos;\n" +
                    "- Principais títulos e marcos (ex.: primeiras aparições em Majors);\n" +
                    "- Mudanças de elenco marcantes. Limite de 1000 caracteres.";

    public static final String TITULOS =
            "Liste os principais títulos da FURIA, separados por jogo:\n" +
                    "- CS2: [títulos];\n" +
                    "- Valorant: [títulos];\n" +
                    "- Outros jogos (se aplicável).\n" +
                    "Inclua anos e adversários nas finais. Limite de 1000 caracteres.";

    public static final String REDES_SOCIAIS =
            "Forneça links oficiais da FURIA, incluindo:\n" +
                    "- Twitter, Instagram, TikTok;\n" +
                    "- Site oficial e canal no YouTube;\n" +
                    "- Plataformas de streaming dos jogadores. Limite de 1000 caracteres.";

    public static final String LOJA =
            "Oriente como comprar produtos oficiais da FURIA:\n" +
                    "- Link da loja online;\n" +
                    "- Itens mais populares (ex.: camisetas, mouses personalizados);\n" +
                    "- Promoções ativas (se houver). Limite de 1000 caracteres.";

    public static final String CALENDARIO =
            "Liste os próximos torneios da FURIA nos próximos 3 meses, incluindo:\n" +
                    "- Nome do torneio e jogo;\n" +
                    "- Datas e fases;\n" +
                    "- Times confirmados (se relevante). Limite de 1000 caracteres.";

    public static String getPrompt(String callbackData) {
        switch (callbackData) {
            case "informacoes_furia":
                return INFO_FURIA;
            case "jogadores_cs2":
                return JOGADORES_CS2;
            case "jogadores_valorant":
                return JOGADORES_VALORANT;
            case "ultimo_jogo":
                return ULTIMO_JOGO;
            case "proximo_jogo":
                return PROXIMO_JOGO;
            case "historico":
                return HISTORICO;
            case "titulos":
                return TITULOS;
            case "redes_sociais":
                return REDES_SOCIAIS;
            case "loja":
                return LOJA;
            case "calendario":
                return CALENDARIO;
            default:
                return "Opção não reconhecida.";
        }
    }

}
