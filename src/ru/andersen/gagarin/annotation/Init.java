package ru.andersen.gagarin.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Init {
    public boolean someMsg() default false;
}
