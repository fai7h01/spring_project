package com.cydeo.loosely_coupled;

import com.cydeo.loosely_coupled.caseFactory.Case;
import com.cydeo.loosely_coupled.monitorFactory.Monitor;
import com.cydeo.loosely_coupled.motherboardFactory.Motherboard;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt();
    }
}
