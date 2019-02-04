package ru.andersen.gagarin.oop;


import ru.andersen.gagarin.oop.inheritance.Office;
import ru.andersen.gagarin.oop.polymorphism.LongRunner;
import ru.andersen.gagarin.oop.polymorphism.Moveable;
import ru.andersen.gagarin.oop.polymorphism.Runner;
import static ru.andersen.gagarin.reflection.AnnotationSearch.*;

public class Solution {
    public static void main(String[] args) {
        //пример полиморфизма с наследоваинем
        Moveable runner = new Runner();
        Moveable longRunner = new LongRunner(5.0d);

        //вызывается метод run, определённый в классе объекта
        runner.run();
        longRunner.run();
        printLine();

        //Проверяем есть ли в нашем классе нужная нам аннотация, если есть - выводим её имя(поле name).
        inspectAnnotation(Office.class);
        inspectAnnotation(String.class);
        printLine();

        //Проверяем есть ли в нашем классе метод, помеченный нужной нам аннотацией и делаем действие(Выводим что-л.)
        callInitMethods(Office.class);
    }

    static void printLine(){
        System.out.println();
    }
}
