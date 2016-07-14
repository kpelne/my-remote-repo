
public class employee1 {
	
	//DATA MEMBERS(FIELDS)
private int salary;

//MEMBER METHODS

public void accept(int sa){
	salary=sa;
}
public void display(){
		System.out.println("\tsalary: "+ salary);
		employee emp1=new employee();
    	emp1.accept();
//emp1.display();
}
}
