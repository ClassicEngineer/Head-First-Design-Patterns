package ru.daniladeveloper.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class BotFather {

    public static void main(String[] args) {

        List<TelegramUpdate> updates = new ArrayList<>();
        updates.add(new TelegramUpdate("Hello"));
        updates.add(new TelegramUpdate("menu"));
        updates.add(new TelegramUpdate("Bye!"));

        var premiumFactory = new PremiumTelegramBotFactory();

        var simpleFactory = new SimpleTelegramBotFactory();

        for (BotType type : BotType.values()) {
            TelegramBot premiumBot = premiumFactory.createBot(type);
            TelegramBot simpleBot = simpleFactory.createBot(type);
            for (TelegramUpdate update : updates) {
                premiumBot.onUpdateReceived(update);
                simpleBot.onUpdateReceived(update);
            }
        }

    }
}
