/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.datastructuresandalgorithm;

/**
 *
 * @author v-andick
 */
public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI * this.radius *this.radius;
    }
    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
}
