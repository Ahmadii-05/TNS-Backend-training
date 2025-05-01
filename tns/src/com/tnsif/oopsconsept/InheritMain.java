package com.tnsif.oopsconsept;
//driver class
public class InheritMain {

	public static void main(String[] args) {
		Hello g = new Hello();
        g.print_hey();
        g.print_hello();
        
        Inherit a =new Inherit();
        a.print_hey();
        
        Inherit b = new Hello();
        b.print_hey();
        
        Inherit c=new Hello();
        c.sound();
 

	}

}
