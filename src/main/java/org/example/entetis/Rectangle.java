package org.example.entetis;

public class Rectangle {
    public Double length = 4.5;
    public Double width = 5.0;
    public String color = "Red";


    public void display() {
        System.out.println("Reectangle{length=" + length + ", Width="  + width + ", color=" + color + "} ");

    }
    public double calcArea() {
        return length * width;
    }

}
