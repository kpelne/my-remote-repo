
abstract public class provider {
	private String name;
	private String circle;
	public provider(String name, String circle) {
		super();
		this.name = name;
		this.circle = circle;
	}
	abstract public void call(long mobile);
	
}
