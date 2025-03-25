package com.java.tutorials.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldInfo {
	String author() default "vizarce";
	String date() default "2025-01-31T14:56:52.867785600";
	int revision() default 3;
	String[] comments() default {"Cute!", "Marvelous!", "Excellent!!!", "Good Luck!", "Happy birthday"};
}
