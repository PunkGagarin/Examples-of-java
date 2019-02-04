package ru.andersen.gagarin.oop;

import ru.andersen.gagarin.oop.polymorphism.LongRunner;
import ru.andersen.gagarin.oop.polymorphism.Moveable;
import ru.andersen.gagarin.oop.polymorphism.Runner;

public class Solution {
    public static void main(String[] args) {
        //пример полиморфизма с наследоваинем
        Moveable runner = new Runner();
        Moveable longRunner = new LongRunner(5.0d);

        //вызывается метод run, определённый в классе объекта
        runner.run();
        longRunner.run();
    }
}
