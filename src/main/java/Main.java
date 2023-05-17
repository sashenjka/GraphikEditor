package main.java;

public class Main {

    public static void main(String[] args) {
        Shape quad = new Quad(10, 15);
        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(3, 4, 5, 6);
        Shape qube = new Qube(3);


        System.out.println("shape is " + quad);
        System.out.println("shape is " + circle);
        System.out.println("shape is " + rectangle);
        System.out.println("shape is " + qube);

        new PrintShapeName(circle);
        circle.printName();
    }


}
