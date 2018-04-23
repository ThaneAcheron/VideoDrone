package videodrone;

import java.awt.*;
import javax.swing.*;
import java.util.*;


public class AnimateTextbox extends JPanel implements Runnable {
    
    Image creatureImg[] = new Image[100];
    Thread runner;
    int pic;
    
    public AnimateTextbox() {
    }
    
    public void run() {
        while(runner == Thread.currentThread()){
           pic++;
            if(pic == 100){
               runner.stop();
           }      
           try {
              Thread.sleep(80);
          } catch(InterruptedException ie) {}
           repaint();
        }
    }
    
}