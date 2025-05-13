package com.tnsif.collectiondemo;

import java.util.Comparator;

public class EmployeeNameCom implements Comparator <Emp>{
    //allen,candy,bobby
	//allen-->e1
	//candy-->e2
	@Override
	public int compare(Emp e1, Emp e2) {
		
		return e1.ename.compareTo(e2.ename);
	}

}
