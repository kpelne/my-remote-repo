
public class joining {
	
//	DATA MEMBERS(FIELDS)
	
private int date;
private int month;
private int year;

// MEMBER METHODS

public void setdate(int da,int mo,int yr){
	date=da;
	month=mo;
	year=yr;
}


public void display()
{
	System.out.print("\tdate: "+ date);
	System.out.print("\tmonth: "+ month);
	System.out.print("\tyear: "+ year);
}
}


