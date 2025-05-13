package com.tnsif.collectiondemo;

import java.util.Comparator;

public class EmployeeSalCom implements Comparator<Emp>{
	
	public int compare(Emp e1, Emp e2) {
		if(e1.sal==e2.sal)
		return 0;
		else if(e1.sal>e2.sal)
			return 1;
		else
			return -1;
	}
}