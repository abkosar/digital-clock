/*
 * @author ardkosar
 */

package digitalclock;

import java.util.Date;

public class ClockThread extends Thread {
    DigitalClock dc;
    String time;
    
    public ClockThread(DigitalClock dc) {
        // Reference to the current object whose constructor is being evoked
        this.dc = dc;
        start();
        
    
        
    }
    
    public void run () {
        while(true) {
            time = "" + new Date();
            dc.jlabClock.setText(time);
        }
        
        
    }    
}
