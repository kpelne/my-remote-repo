
public class employee3 {
	
			// DATA MEMBERS(FIELDS)
		String name;
		 String designation;
		int salary;
		
	//		MEMBER METHODS
		
		public void accept(String na,String de,int sa){
			name=na;
			designation=de;
			salary=sa;
		}
		public void display(){
			System.out.println("name: "+ name);
			System.out.println("designation: "+ designation);
			System.out.println("\tsalary: "+ salary);
 
	employee emp3=new employee();
	    	emp3.accept();
//emp3.display();
	    	}
		}

