package ru.daniladeveloper.patterns.factory;

public class SimpleBotPropertiesFactory implements BotPropertiesFactory {
    @Override
    public BotId createBotId() {
        return new BotNumberId();
    }

    @Override
    public BotName createBotName(String name) {
        return new SimpleBotName(name);
    }
}
