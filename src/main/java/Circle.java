package main.java;

public class Circle extends Shape {
    {
        System.out.println(" У коді нижче будуть представлені фігури різного типу:");
    }

    private int radius;


    public Circle(int radius) {
        this.radius = radius;
        setName("Circle");
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * (float) radius * (float) radius);
    }

    @Override
    public String toString() {
        return "Circle {" + "name= " + getName() +
                ", radius= " + radius + ", area= " + getArea() +
                '}';
    }
}
