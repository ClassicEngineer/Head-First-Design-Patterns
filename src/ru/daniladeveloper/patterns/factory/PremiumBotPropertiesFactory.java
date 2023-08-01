package ru.daniladeveloper.patterns.factory;

public class PremiumBotPropertiesFactory implements BotPropertiesFactory {
    @Override
    public BotId createBotId() {
        return new BotUuid();
    }

    @Override
    public BotName createBotName(String name) {
        return new PremiumBotName(name, "⭐");
    }
}
