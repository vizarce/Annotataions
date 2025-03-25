package com.java.tutorials.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDateTime;
import java.time.LocalDate;


@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, 
	ElementType.METHOD, ElementType.LOCAL_VARIABLE, 
	ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, 
	ElementType.PARAMETER, ElementType.TYPE_PARAMETER, 
	ElementType.TYPE_USE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
	String name() default "Vitaliy Zhakun";
	String repo() default "http://github.com/vizarce";
	int version() default 1;
}
