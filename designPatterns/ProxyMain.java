package Eclipse_testing.designPatterns;

public class ProxyMain {
	static ProxyP p;
	
	public static void main(String[] args) {
		p = new ProxyP();
		p.doThis();
	}
	
}
