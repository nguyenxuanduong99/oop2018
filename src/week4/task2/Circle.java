package week4.task2;

/**
 * Created by CCNE on 10/10/2018.
 */
public class Circle {
    static final double PI = 3.14;
    private double radius;
    //TODO: getter, setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){
        radius = 1.0;
    }


    public Circle(double radius){
        this.radius = radius;
    }


    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(){
        return PI*Math.pow(radius,2);
    }


    public double getPerimeter(){
        return PI*radius*2;
    }

    public String toString() {
        return "Circle";
    }
}
