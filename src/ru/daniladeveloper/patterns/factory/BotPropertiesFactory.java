package ru.daniladeveloper.patterns.factory;

public interface BotPropertiesFactory {

    BotId createBotId();
    BotName createBotName(String name);
}
