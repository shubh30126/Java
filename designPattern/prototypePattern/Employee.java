package designPattern.prototypePattern;

import java.util.*;

public class Employee implements Cloneable {

	List<String> empList;
	
	
	
	public Employee() {
		super();
		empList=new ArrayList<String>();
	}

	public Employee(List<String> empList) {
		super();
		this.empList = empList;
	}
	
	public void loadData(){
		empList.add("Ram");
		empList.add("Shyam");
		empList.add("Ghanshyam");
	}



	public Object clone(){
		/* Shallow Cloning because its changing the state and behaviour of original object too
			return new Employee(this.empList);
			*/
		/* Now Deep Cloning */
		List<String> temp=new ArrayList<String>();
		temp.addAll(empList);
		return new Employee(temp);
		
		
	}
}
