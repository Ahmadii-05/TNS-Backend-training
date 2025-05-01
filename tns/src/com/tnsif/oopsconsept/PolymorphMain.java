package com.tnsif.oopsconsept;

public class PolymorphMain {

	public static void main(String[] args) {
		        // Creating a reference 
		        Polymorph p = new Polymorph();
		        
		        // Calling the display method. It calls the 
		        // overridden version in Teacher class
		        p.display();  
		        
		        Polymorph e = new Poly();
		        e.display();
		        

	}

}
