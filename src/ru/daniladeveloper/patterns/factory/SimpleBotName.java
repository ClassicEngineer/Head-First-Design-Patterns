package ru.daniladeveloper.patterns.factory;

public class SimpleBotName implements BotName {

    private String name;

    public SimpleBotName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
