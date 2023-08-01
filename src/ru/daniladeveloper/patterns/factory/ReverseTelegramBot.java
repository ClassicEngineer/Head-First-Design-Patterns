package ru.daniladeveloper.patterns.factory;

public class ReverseTelegramBot extends TelegramBot {

    private final BotPropertiesFactory botPropertiesFactory;


    @Override
    protected String getBotName() {
        return botName.getName();
    }

    public ReverseTelegramBot(BotPropertiesFactory botPropertiesFactory) {
        this.botPropertiesFactory = botPropertiesFactory;
    }

    @Override
    public void register(BotType type) {
        String name = type.name();
        botName = botPropertiesFactory.createBotName(name);
        botId = botPropertiesFactory.createBotId();
        System.out.println("Register: " + name + " with id: " + botId.getId());

    }
    @Override
    protected void onUpdateReceived(TelegramUpdate update) {
        String message = update.getUserMessage();
        String reversed = new StringBuilder(message).reverse().toString();
        sendMessage(reversed);
    }
}
