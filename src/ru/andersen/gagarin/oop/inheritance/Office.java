package ru.andersen.gagarin.oop.inheritance;

import ru.andersen.gagarin.annotation.InheritCount;
import ru.andersen.gagarin.oop.encapsulation.Room;

//пример наследования
@InheritCount(name = "Первый наследник")
public class Office extends Room {
    private int equipment;

    public Office() {

    }

    public Office(double width, double length, double height, int equipment) {
        super(width, length, height);
        this.equipment = equipment;
    }


    @Override
    public double getSize() {
        return super.getSize() * height;
    }

    public int getEquipment() {
        return equipment;
    }

    public void setEquipment(int equipment) {
        this.equipment = equipment;
    }

    public static void main(String[] args) {
    }
}

