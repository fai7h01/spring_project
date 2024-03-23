package com.cydeo;

import com.cydeo.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        PC pc = container.getBean(PC.class);
        System.out.println(pc.getTheCase().getDimensions().getDepth());

    }
}
