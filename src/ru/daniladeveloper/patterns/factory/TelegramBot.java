package ru.daniladeveloper.patterns.factory;

public abstract class TelegramBot {

    protected BotName botName;

    protected BotId botId;

    abstract protected String getBotName();

    abstract public void register(BotType type);


    abstract protected void onUpdateReceived(TelegramUpdate update) ;

    void sendMessage(String message) {
        System.out.println("[" + getBotName() + "]: " + message);
    }

}
