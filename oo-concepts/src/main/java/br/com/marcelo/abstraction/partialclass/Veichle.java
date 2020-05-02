package br.com.marcelo.abstraction.partialclass;

/**
 * 1 - An abstract class must be extended to provide functionality for the abstract methods
 * 2 - An abstract class is a class may not have abstract method
 * 3 - If it has an abstract method, the subclass must implement the behavior of this method
 * <p>
 * If a class has abstract method, make the class as abstract.
 */
public abstract class Veichle {

    /**
     * An abstract method is one which has only declaration and no definition.
     * The keyword abstract makes the method abstract.The abstract method should be implemented in the subclasses.
     * <p>
     * <p>
     */
    public abstract void turnOff();

    public void activeAccelerator() {
        activeEngine();
        System.out.println("Speed Up");
    }

    /**
     * An abstract class can have private methods. But it can be used only from within the abstract class.
     */
    private void activeEngine() {
        System.out.println("Active Engine ");
    }

    /**
     * A final method cannot be overridden in the subclass.
     */
    public final void activeBreak() {
        System.out.println("Breaking ");
    }

}
