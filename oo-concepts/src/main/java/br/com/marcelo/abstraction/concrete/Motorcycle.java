package br.com.marcelo.abstraction.concrete;

import br.com.marcelo.abstraction.partialclass.Veichle;

public class Motorcycle extends Veichle {

    @Override
    public void turnOff() {
        System.out.println("Turn off Motorcycle");
    }

    @Override
    public void activeAccelerator() {
        super.activeAccelerator();
        System.out.println("Speed Up more Motorcycle");
    }
}
