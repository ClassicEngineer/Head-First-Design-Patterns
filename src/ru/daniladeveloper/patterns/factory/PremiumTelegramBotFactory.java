package ru.daniladeveloper.patterns.factory;

public class PremiumTelegramBotFactory implements TelegramBotFactory {
    @Override
    public TelegramBot createBot(BotType type) {
        PremiumBotPropertiesFactory factory = new PremiumBotPropertiesFactory();
        return registerBot(type, factory);
    }
}
