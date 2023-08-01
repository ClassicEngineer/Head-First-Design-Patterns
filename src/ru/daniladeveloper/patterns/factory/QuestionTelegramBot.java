package ru.daniladeveloper.patterns.factory;

public class QuestionTelegramBot extends TelegramBot {
    private BotPropertiesFactory botPropertiesFactory;

    @Override
    protected String getBotName() {
        return botName.getName();
    }

    public QuestionTelegramBot(BotPropertiesFactory botPropertiesFactory) {
        this.botPropertiesFactory = botPropertiesFactory;
    }


    public void register(BotType type) {
        String name = type.name();
        botName = botPropertiesFactory.createBotName(name);
        botId = botPropertiesFactory.createBotId();
        System.out.println("Register: " + name + " with id: " + botId.getId());
    }
    @Override
    protected void onUpdateReceived(TelegramUpdate update) {
        String message = update.getUserMessage();
        String question  =  message + "???";
        sendMessage(question);
    }
}
