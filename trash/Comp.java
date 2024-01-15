package Eclipse_testing.trash;

import java.util.ArrayList;

public class Comp implements Comparable<Comp> {

	int number;
	
	Comp(int num) {
		this.number = num;
	}
	
    @Override
    public String toString() {
        return Integer.toString(number);
    }
	
	public static void main(String[] args) {
		Comp a = new Comp(2);
		Comp b = new Comp(0);
		Comp c = new Comp(5);
		
		System.out.println(a.compareTo(b));
		
		ArrayList<Comp> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
	}
	
	@Override
	public int compareTo(Comp o) {
		return number - o.number;
	}

}
