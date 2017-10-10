package ca.pragra.ca.pragra.java.training;

/*
    Interfaces are abstract in java, prior to Java 8, interfaces used to content only method specification or siganture.
    Java 8 added a concrete method using default and key work and interface can have static methods as well.

    inteface doesn't support mutuable instance varibles at all.

    A class can implement multiple interface
 */

public interface Shape {

    //Method should public so implementor can use it.
    public double getArea();

    default void printMessage(){
        System.out.println("This is default concerte method from interface");
    }

    default void antoherPrint(){
        System.out.println("This is default another concerte method from interface");
    }


    public static double sumAreas(Shape[] shapes){
        double sum = 0;
        for (Shape shape:shapes) {
            sum = sum+shape.getArea();
        }
        return sum;
    }
}
