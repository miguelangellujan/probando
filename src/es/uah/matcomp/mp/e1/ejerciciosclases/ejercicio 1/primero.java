package es.uah.matcomp.mp.e1.ejerciciosclases;

public class primero {
    private double radius=1.0;
    public primero() {
        radius = 1.0;
    }
    public primero(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius= newRadius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle[radius="+radius+"]";
}}


