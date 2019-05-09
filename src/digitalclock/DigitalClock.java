package digitalclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * @author ardkosar
 */
public class DigitalClock extends JFrame {
    
    JLabel jlabClock;
    
    public DigitalClock(){
        jlabClock =  new JLabel();
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jlabClock);
        setSize(800,800);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    
    public static void main (String[] args){
    
        new DigitalClock();
    }

}
