package com.cydeo.loosely_coupled.monitorFactory;

public class SonyMonitor extends Monitor{

    public SonyMonitor(String model, String manufacturer, int size) {
        super(model, manufacturer, size);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
