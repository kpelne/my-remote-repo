
public class employee2 {
	//DATA MEMBERS(FIELDS)
	private int salary;
	int hrs;

	//MEMBER METHODS

	public void accept(int sa,int h){
		salary=sa;
		hrs=h;
	}
	public void display(){
			System.out.println("\tsalary: "+ salary);
			System.out.println("\thrs: "+ hrs);
			employee emp2=new employee();
	    	emp2.accept();
//emp2.display();
}
}