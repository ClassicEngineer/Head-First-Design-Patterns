package ru.daniladeveloper.patterns.observer;

public class Phone implements ObservableDevice{
    @Override
    public void listen() {
        System.out.println("Bla-Bla by phone");
    }
}
