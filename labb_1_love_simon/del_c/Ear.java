package Eclipse_testing.labb_1_love_simon.del_c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ear implements ActionListener {
    MyButton button;
    
	public Ear(MyButton button) {
        this.button = button;
        this.button.addActionListener(this);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		((MyButton) e.getSource()).toggleState();
		}
}
