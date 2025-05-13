package com.tnsif.collectiondemo;
//demo for comparator
public class Emp {
  public int eid;
  public String ename;
  public float sal;
public Emp(int eid, String ename, float sal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.sal = sal;
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
}
}
