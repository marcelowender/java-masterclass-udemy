package br.com.marcelo;

import br.com.marcelo.abstraction.concrete.Car;
import br.com.marcelo.abstraction.concrete.Motorcycle;
import br.com.marcelo.abstraction.partialclass.Veichle;

public class App {
    public static void main(String[] args) {
        Veichle camaro = new Car();
        driveVeichle(camaro);
        System.out.println("\n===========\n");

        Veichle harley = new Motorcycle();
        driveVeichle(harley);
    }


    public static void driveVeichle(Veichle veichle) {
        veichle.activeAccelerator();
        veichle.activeBreak();
        veichle.turnOff();
    }
}
