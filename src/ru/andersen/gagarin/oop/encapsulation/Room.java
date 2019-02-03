package ru.andersen.gagarin.oop.encapsulation;

//пример инкапсуляции, поля класса объявлены как private, к ним нельзя обратиться напрямую
//кроме поля height, использующегося в методах наследников и потому объявленного как protected.
public abstract class Room {
    private double width;
    private double length;
    protected double height;

     public Room() {
    }

    public Room(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getSize(){
        return width*length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
