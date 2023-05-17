package main.java;

public class Qube extends Shape {

    private int side;

    private int allArea;

    public int getSide() {
        return side;
    }

    public Qube(int side) {
        this.side = side;
        setName("Qube");
        allArea();
    }


    @Override
    public String getName() {
        return super.getName();
    }

    private void allArea() {
        allArea = side * side * side;
    }

    @Override
    public String toString() {
        return "Qube {" + "name= " + getName() +
                ", side = " + side +
                ", area= " + allArea +
                '}';
    }
}

