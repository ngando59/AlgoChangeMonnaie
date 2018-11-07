
public class Test {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.i);
		s.i++;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.i);
		
	}
}
