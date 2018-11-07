
public class Singleton {
	private static Singleton INSTANCE;
	public int i = 0;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE =  new Singleton();
		}
		return INSTANCE;
	}
}
