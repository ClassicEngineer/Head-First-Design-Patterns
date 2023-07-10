package ru.daniladeveloper.patterns.observer;

public class Televisor implements ObservableDevice{
    @Override
    public void listen() {
        System.out.println("In today news we will see:");
    }
}
