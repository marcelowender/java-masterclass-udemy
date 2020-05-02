package br.com.marcelo.abstraction.concrete;

import br.com.marcelo.abstraction.partialclass.Veichle;

/**
 * Using the final word in classes blocks inheritance
 * Car cannot be extended
 */
public final class Car extends Veichle {


    @Override
    public void turnOff() {
        System.out.println("Turn off CAR");
    }
}
