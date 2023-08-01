package ru.daniladeveloper.patterns.factory;

import java.util.UUID;

public class BotUuid implements BotId {

    private final String id;

    public BotUuid() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String getId() {
        return id;
    }
}
