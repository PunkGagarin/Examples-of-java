package ru.andersen.gagarin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

@Documented
@Inherited
public @interface InheritCount {
    String name();
}
