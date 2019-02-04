package ru.andersen.gagarin.oop.polymorphism;

//перегружаем метод run
 public class Runner implements Moveable{


    public boolean run(){
        System.out.println("Метод основного класса");
        return true;
    }

    @Override
    public boolean run(Boolean isRaining) {
        return !isRaining;
    }

    public boolean run(Boolean isLazy, Boolean isRaining) {
        return !isLazy && !isRaining;
    }

    //нельзя изменять тип возвр значения или сужать модификатор доступа
    /*
    @Ovverride
    private String run(Boolean isLazy, Boolean isRaining) {
        return !isLazy+""+!isRaining+"";
    }
    */
}
