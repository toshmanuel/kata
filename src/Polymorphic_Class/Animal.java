package Polymorphic_Class;

public class Animal {
    private int numberOfEyes;
    private int numberOfLegs;

    public void move(){
        System.out.println("Animal can move");
    }

}
// for a class to be abstract, it must have at least one abstract method (i.e a method without a defined method)
// public void methodName();

// also the class must have no constructor
