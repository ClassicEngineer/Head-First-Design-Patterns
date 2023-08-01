package ru.daniladeveloper.patterns.factory;

public class PremiumBotName implements BotName {

    private String name;

    private String emoji;

    public PremiumBotName(String name, String emoji) {
        this.name = name;
        this.emoji = emoji;
    }

    @Override
    public String getName() {
        return name + " " + emoji;
    }
}
