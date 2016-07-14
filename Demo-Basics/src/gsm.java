
abstract public class gsm extends provider {
	public gsm(String name, String circle) {
		super(name, circle);
		// TODO Auto-generated constructor stub
	}

	abstract public void  gsmspecs();
	public gsm(){
		this ("default","default");
		}
	abstract public void call(long mobile);
	}

