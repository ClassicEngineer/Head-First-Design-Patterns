package ru.daniladeveloper.patterns.observer;

import java.util.Collection;
import java.util.List;

public class SpyObserver {

    List<ObservableDevice> devices;

    public SpyObserver(Collection<ObservableDevice> devices) {
        this.devices = devices.stream().toList();
    }

    public void getInformation() {
        devices.forEach(device -> {
            System.out.println("Getting information from: " + device.getClass().getSimpleName());
            device.listen();
        });
    }


}
