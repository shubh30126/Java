package designPattern.prototypePattern;

public class prototypePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		emp.loadData();

		for(String s:emp.empList)
			System.out.print(s+" , ");
		System.out.println("Cloning Object");
		
		Employee emp1=(Employee)emp.clone();
		emp1.empList.add("Shubhanshu");
		System.out.println("Now Both list are");
		System.out.println("emp object contains");
		for(String s:emp.empList)
			System.out.print(s+" , ");
		System.out.println("\nemp1 object contains");		
		for(String s:emp1.empList)
			System.out.print(s+" , ");
		
	}
	

}
