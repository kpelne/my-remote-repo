
public class employee {
	// DATA MEMBERS(FIELDS)
	String name;
	 String designation;
	int salary;
	private joining d;
	public void doj(joining f)
	{
	d=f;
}
	

//	MEMBER METHODS
	
	public void accept(){
		name="kajal";
		designation="se";
		salary=100000;
	}
	public void display(){
		System.out.println("name: "+ name);
		System.out.println("designation: "+ designation);
		System.out.println("\tsalary: "+ salary);
// d.display();
employee emp=new employee();
    	emp.accept();
//    	emp.display();
    	}
	}