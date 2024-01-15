package Eclipse_testing.designPatterns;

// Proxy
public class ProxyP implements ProxySI{
	ProxyS actual;

	public ProxyP() {
		this.actual = new ProxyS();
	}
	
	@Override
	public void doThis() {
		actual.doThis();
	}
	
	
}
