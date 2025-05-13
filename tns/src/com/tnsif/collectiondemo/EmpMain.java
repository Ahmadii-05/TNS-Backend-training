package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		List<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(101,"Allen",87893));
		l.add(new Emp(304,"candy",67567));
		l.add(new Emp(205,"bobby",45893));
		
		
		//retrieving data based on name sorting
		System.out.println("sort by name:");
		Collections.sort(l,new EmployeeNameCom());
		for(Emp e:l) {
			System.out.println(e.eid + "," + e.ename + "," + e.sal);

		}
		
		//retrieving data based on salary sorting
				System.out.println("sort by salary:");
				Collections.sort(l,new EmployeeSalCom());
				for(Emp e:l) {
					System.out.println(e.eid + "," + e.ename + "," + e.sal);

				}

	}

}
