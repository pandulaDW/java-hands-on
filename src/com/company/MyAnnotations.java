package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotations can be used in class, method levels
// Annotations can be used in local variables, parameter levels
// fields inside annotation interface called annotation elements

@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@interface MyAnno {
    String name();

    String project() default "Basic";

    String version() default "13";
}

@MyAnno(name = "Pandula")
public class MyAnnotations {

}
