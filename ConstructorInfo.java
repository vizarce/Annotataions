package com.java.annotations.*;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDateTime;
import java.time.LocalDate;


@Documented
@Target(ElementType.CONSTRUCTOR)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ConstructorInfo {
	String author() default "vizarce";
	String date() default "2025-01-31T14:56:52.867785600";
	String clazz() default "Clazz<?>.class";
	String modifier() default "public";
}
