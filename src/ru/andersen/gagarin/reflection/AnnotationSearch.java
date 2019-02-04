package ru.andersen.gagarin.reflection;

import ru.andersen.gagarin.annotation.InheritCount;
import ru.andersen.gagarin.annotation.Init;

import java.lang.reflect.Method;

public class AnnotationSearch {

    //поиск нужной аннотации среди классов
    public static void inspectAnnotation(Class<?> annot){
        if(annot.isAnnotationPresent(InheritCount.class)){
            InheritCount inheritCount = annot.getAnnotation(InheritCount.class);
            System.out.println(inheritCount.name());
        }
        else{
            System.out.println("Doesn't have our @annotation");
        }
    }

    //поиск аннотации среди методов
    public static void callInitMethods(Class<?> annot){
        for(Method x : annot.getMethods()){
            if(x.isAnnotationPresent(Init.class)){
                System.out.println("\nFound @Init method!\n");
            }
            else{
                System.out.println("Nothing was found");
            }
        }
    }
}
