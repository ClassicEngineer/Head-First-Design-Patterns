package ru.daniladeveloper.patterns.factory;

public class SimpleTelegramBotFactory implements TelegramBotFactory {
    @Override
    public TelegramBot createBot(BotType type) {
        SimpleBotPropertiesFactory factory = new SimpleBotPropertiesFactory();
        return registerBot(type, factory);
    }
}
