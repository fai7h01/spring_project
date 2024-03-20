package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        System.out.println("Creating Container");
        //Creating container by using ApplicationContext
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);

        //Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();

        System.out.println("************Retrieving the beans******************");

        SonyMonitor sony = container.getBean(SonyMonitor.class);
        DellCase dell = container.getBean(DellCase.class);
        AsusMotherboard asus = container.getBean(AsusMotherboard.class);

        PC myPC = new PC(dell, sony, asus);

        myPC.powerUp();

        System.out.println("************Retrieving the beans******************");

//        Monitor monitor = container.getBean(Monitor.class);
//        Case theCase = container.getBean(Case.class);
//        Motherboard motherboard = container.getBean(Motherboard.class);
//
//        PC myPC2 = new PC(theCase, monitor, motherboard);

        System.out.println("************Multiple Objects******************");

        Monitor theMonitor1 = container.getBean("monitorSony", Monitor.class); // DEFAULT BEAN NAME (method name)
        Monitor theMonitor2 = container.getBean("sony",Monitor.class);        // CUSTOM BEAN NAME
        Monitor theMonitor3 = container.getBean(Monitor.class);                     // @Primary


    }
}
