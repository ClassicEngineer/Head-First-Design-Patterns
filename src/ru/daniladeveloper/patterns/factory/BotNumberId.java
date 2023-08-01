package ru.daniladeveloper.patterns.factory;

import ru.daniladeveloper.patterns.builder.RandomUtil;

import java.util.Random;

public class BotNumberId implements BotId {

    private Long id;


    public BotNumberId() {
        this.id = new Random().nextLong();
    }

    @Override
    public String getId() {
        return id.toString();
    }
}
