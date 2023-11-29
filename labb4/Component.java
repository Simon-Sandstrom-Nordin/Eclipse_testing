package Eclipse_testing.labb4;

interface Component {

	public float getWeight();
	
	public String toString();
	
	public void Add(Component component);
	
	public void Remove(Component component);
	
	public Component GetChild(Component component);
	
}
