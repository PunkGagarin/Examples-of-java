package ru.andersen.gagarin.oop.polymorphism;

import ru.andersen.gagarin.annotation.InheritCount;
import ru.andersen.gagarin.oop.inheritance.Office;

//пример перегрузки(полиморфизма)
@InheritCount(name = "Второй наследник")
class SmallOffice extends Office {
    // класс Office подходит по всем параметрам для этого класса, в том числе и по оборудованию.

    public SmallOffice() {
    }

    public SmallOffice(double width, double length, double height, int equipment) {
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
