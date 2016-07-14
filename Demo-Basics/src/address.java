
public class address {
	 
	//DATA MEMBERS(FIELDS)
	
	private String city;
	private String streetname;
	private int pincode;
	
	//DEFAULT CONSTRUCTOR
	
	public address(){
		city="pune";
		streetname="m.g.road";
		pincode=440034;
			}

	//MEMBER METHODS
	
	public void accept(String ci,String st,int pi){
		city=ci;
		streetname=st;
		pincode=pi;
	}
	
	public void display()
	{
		System.out.println("city:"+city);
		System.out.println("streetname:"+streetname);
		System.out.println("\tpincode:"+pincode);
	}
}
	
	

