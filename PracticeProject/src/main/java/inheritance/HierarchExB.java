package inheritance;

public class HierarchExB extends HierarchExA {
	double hike = 0.50;
	public void incrementSal() {
	   salary = salary + (salary * hike);
	   System.out.println("Salary Increment : "+salary);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchExB obj=new HierarchExB();
		obj.dispSal();
		obj.incrementSal();
	}

}
