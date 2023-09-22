package Eclipse_testing.delC;

import java.awt.Color;
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
	public void actionPerformed(ActionEvent e) {
		this.button.toggleState();	
	}
}
