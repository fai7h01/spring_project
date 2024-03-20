package com.cydeo.stereotype_annotation.monitorfactory;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AcerMonitor extends Monitor{

    public AcerMonitor() {
        super("25 inch beast", "Acer", 25);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer");
    }
}
