package main.java;

public class Quad extends Shape {
    static {
        System.out.println(" Домашнє завдання 8 модуля:\n Продумай ієрархію класів:");
    }

    private int sideHeight;
    private int sideLength;
    private int area;


    public Quad(int sideHeight, int sideLength) {
        setName("Quad");
        this.sideHeight = sideHeight;
        this.sideLength = sideLength;

        calcArea();
    }

    private void calcArea() {
        area = sideHeight * sideLength;
    }


    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Quad {" + "name= " + getName() +
                ", sideHeight= " + sideHeight +
                ", sideLength= " + sideLength +
                ", area= " + area +
                '}';
    }
}
