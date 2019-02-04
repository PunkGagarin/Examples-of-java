package ru.andersen.gagarin.oop.polymorphism;

public interface Moveable {
    boolean run();
    boolean run(Boolean isRaining);
    boolean run(Boolean isLazy, Boolean isRaining);
}

