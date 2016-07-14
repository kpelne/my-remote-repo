
public class Entry {
    public static void main(String[] args) {
    	
//	    System.out.println("hello,world!");
    	
    	person p=new person();
    	
    	p.accept("Vikas", 34);
//   	p.display();
    	
    	person p2=p;
    	System.out.println(p2==p);
    	
    	person p3=new person();
    	
  	p3.display();
    	
    	p3=p;
    	p3.display();
    	
    	System.out.println(p3 ==p);
    	
    	
    }
}

