
package com.lab.ocp.day01;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle1", 5);
        Circle circle2 = new Circle();
        
        circle2.name = "Circle2";
        circle2.r = 10;
        circle2.area = circle2.r*circle2.r*Math.PI;
        
        circle.print();
        circle2.print();
    }
}
