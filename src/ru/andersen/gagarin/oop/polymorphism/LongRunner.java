package ru.andersen.gagarin.oop.polymorphism;

public class LongRunner extends Runner{
    double speed;

    public LongRunner(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean run() {
        System.out.println("Метод наследника");
        return true;
    }

    public boolean run(double speed){
        return speed>=this.speed;
    }
}
