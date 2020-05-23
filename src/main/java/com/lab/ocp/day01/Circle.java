package com.lab.ocp.day01;

public class Circle {
    String name;    // 名稱
    int r;  // 半徑
    double area;    // 面積
    
    public Circle(){
        
    }
    
    public Circle(String name, int r) {
        this.name = name;
        this.r = r;
        this.area = r*r*Math.PI;
    }
    
    public void print() {
        System.out.printf("名稱: %s \n 半徑: %d \n 面積: %.2f",name, r, area);
        System.out.println();
    }
    
}
