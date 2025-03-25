package com.java.annotations.*;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
//@Target(ElementType.PACKAGE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Documentation {
	String[] value() default {"This is the documentation of the Class, Object, Parameter, Field, Method, Interface, Enum etc.", 
		"Enum", "Clazz<?>", "version = 1.1.2", "revision = 5", "author = vizarce", "web = www.example.com/examples"};

}
