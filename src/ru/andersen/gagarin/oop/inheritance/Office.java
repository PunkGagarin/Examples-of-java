package ru.andersen.gagarin.oop.inheritance;

import ru.andersen.gagarin.annotation.InheritCount;

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

@InheritCount(name = "Второй наследник")
class Bathroom extends Office {
    //подходит по всем параметрам, в том числе и по оборудованию.

    //пример перегрузки(полиморфизма)
    public Bathroom() {
    }

    public Bathroom(double width, double length, double height, int equipment) {
        super(width, length, height, equipment);
    }

    @Override
    public double getSize() {
        return super.getSize();
    }

    public double getSize(double height) {
        return getSize() * height;
    }

    //Сколько дврей можем установить, в зависимости от кол-ва стен
    public int getSize(int doors, int walls) {
        return walls < doors ? walls : doors;
    }
}
