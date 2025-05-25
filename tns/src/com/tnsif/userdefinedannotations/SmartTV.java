//program to demonstrate user defined annotations
package com.tnsif.userdefinedannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//mentioning where it is applicable(TYPE->class)
@Target(ElementType.TYPE)
//At what time I should consider this annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTV {
	String os();
	int width();
	int height();

}
