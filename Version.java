package com.java.tutorials.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, 
	ElementType.METHOD, ElementType.LOCAL_VARIABLE, 
	ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, 
	ElementType.PARAMETER, ElementType.TYPE_PARAMETER, 
	ElementType.TYPE_USE})
@Inherited
@Retention(RetentionPolicy.CLASS)
public @interface Version {
	int primary() default 1;
	String value() default "1.0.0";
	int revision() default 1;
	String date() default "2025-01-31";
}
