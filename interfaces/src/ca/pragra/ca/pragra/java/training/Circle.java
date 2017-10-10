package ca.pragra.ca.pragra.java.training;

public class Circle implements Shape {

    double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

}
