//program to demonstrate class to use user defined annotations
package com.tnsif.userdefinedannotations;

@SmartTV(os="android", height= 40, width =50)
@SmartPhone(os="iphone",version=12)
public class AndroidSeries {
	String model;
	int screenSize;
	
	//parameterized constructor
	public AndroidSeries(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}
	
	
	

}
