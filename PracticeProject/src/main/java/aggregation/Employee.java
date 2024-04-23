package aggregation;

public class Employee {
		String empname;
		int empid;
		String dept;
		Company c;
		public Employee(String empname,int empid,String dept,Company c) {
			this.empname=empname;
			this.empid=empid;
			this.dept=dept;
			this.c=c;
		}
		public void display() {
			System.out.println(c.name+" "+c.licno);
			System.out.println(empname+" "+empid+" "+dept);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company obj=new Company("Universal",579546);
		Employee obj1=new Employee("Meenu",2205,"Manager",obj);
		obj1.display();
	}
}


