
public class person {
// DATA MEMBERS(FIELDS)
	private String name;
	private int age;
	
//	DEFAULT CONSTRUCTOR
	
	public person(){
		System.out.println("person instantiated.....");
		name="NA";
		age=18;
	}
	
//	MEMBER METHODS
	
	public void accept(String nm,int ag){
		name=nm;
		age=ag;
	}
	
	
	public void display(){
		System.out.println("name: "+ name);
		System.out.println("\tage: "+ age);
address addr=new address();
    	
    	addr.accept("pune","mg road",440034);
    	addr.display();
    	}
	
	
}
