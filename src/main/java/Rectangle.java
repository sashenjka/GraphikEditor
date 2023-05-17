package main.java;

public class Rectangle extends Shape {
    private int x1, y1, x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        setName("Rectangle");
    }

    public int getArea() {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        return width * height;
    }

    @Override
    public String toString() {

        return "Rectangle {" + "name= " + getName() +
                ", corners = {" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + "}, area = " + getArea() + "}"
                ;
    }
}

