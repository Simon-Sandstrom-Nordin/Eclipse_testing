package Eclipse_testing.love_code_del_C;

import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ear implements ActionListener {
    MyButton button;
    public Ear (MyButton button){
        this.button = button;
        this.button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        MyButton button = (MyButton) e.getSource();
        button.ToggleState();
    }
}
