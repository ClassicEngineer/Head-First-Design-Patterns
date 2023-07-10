package ru.daniladeveloper.patterns.observer;

import java.util.List;

public class ObserverMain {

    public static void main(String[] args) {
        var devices = List.of(new Phone(), new Smartphone(), new Televisor());

        SpyObserver observer = new SpyObserver(devices);

        observer.getInformation();

    }
}
