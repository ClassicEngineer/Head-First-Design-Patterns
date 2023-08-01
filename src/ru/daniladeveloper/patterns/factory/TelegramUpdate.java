package ru.daniladeveloper.patterns.factory;

public class TelegramUpdate {

    private String message;
    public String getUserMessage() {
        return message;
    }

    public TelegramUpdate(String message) {
        this.message = message;
    }
}
