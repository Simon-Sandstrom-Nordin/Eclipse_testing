package Eclipse_testing.labb_1_love_simon.del_c;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ear implements ActionListener {
    MyButton button;
    
	public Ear(MyButton button) {
        this.button = button;
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.toggleState();
            }
        });
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {}
}
