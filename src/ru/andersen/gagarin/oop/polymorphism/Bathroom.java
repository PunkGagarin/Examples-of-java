package ru.andersen.gagarin.oop.polymorphism;

import ru.andersen.gagarin.annotation.InheritCount;
import ru.andersen.gagarin.oop.inheritance.Office;

//пример перегрузки(полиморфизма)
@InheritCount(name = "Второй наследник")
class Bathroom extends Office {
    // класс Office подходит по всем параметрам для этого класса, в том числе и по оборудованию.

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

    public static void main(String[] args) {
        Bathroom bath = new Bathroom(15.2, 7.3, 2.0, 3);
        System.out.println("Метод без параметров: "+bath.getSize()+
                "\nМетод с другой высотой: "+bath.getSize(3)+
                "\nМетод с дверьми: "+bath.getSize(5,4));
    }
}
