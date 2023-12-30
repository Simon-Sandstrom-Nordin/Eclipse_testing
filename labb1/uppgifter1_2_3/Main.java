package Eclipse_testing.labb1.uppgifter1_2_3;

import java.awt.Color;

public class Main {
	
	public static void main(String []args) {
		
		MyFrameTwo frame = new MyFrameTwo();
		
		MyButton button1 = new MyButton(Color.blue, Color.red, "1", "2");
		MyButton button2 = new MyButton(Color.black, Color.white, "a", "b");
		frame.add(button1);
		frame.add(button2);
		frame.setVisible(true);
		
	}

}
