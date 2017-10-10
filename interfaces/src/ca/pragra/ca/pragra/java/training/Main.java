package ca.pragra.ca.pragra.java.training;



public class Main {

    public static void main(String[] args){

        Shape shape = new Circle(10.0);

        System.out.println(shape.getArea());

        shape.printMessage();
        shape.antoherPrint();
    }
}
