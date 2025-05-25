package com.tnsif.userdefinedannotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//giving instruction to jvm
@Retention(RetentionPolicy.RUNTIME)

public @interface SmartPhone {
	String os() default "Android";
	int version() default 1;

}
