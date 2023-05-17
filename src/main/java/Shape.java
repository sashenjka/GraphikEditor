package main.java;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }

    public void setName(String name) {
        if (this.name != getName() || name.trim().isBlank() || name.length() > 100) {
            return;
        }
        this.name = name;

    }
}
