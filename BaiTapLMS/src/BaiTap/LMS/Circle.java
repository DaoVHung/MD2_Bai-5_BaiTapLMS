package BaiTap.LMS;

public class Circle {
    private double radius = 0.1;
    private String color = "red";
    public Circle(){
        this.radius = 0.1;
        this.color = "red";
    };
    public Circle(double radius){
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
