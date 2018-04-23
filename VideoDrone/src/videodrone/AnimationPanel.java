package videodrone;

import java.awt.*;
import javax.swing.*;
import java.util.*;


public class AnimationPanel extends JPanel implements Runnable {
    Image creatureImg[] = new Image[100];
    Thread runner;
    int pic;
    
    public AnimationPanel() {
        super();
        String imgs[] = {"C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0001.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0002.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0003.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0004.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0005.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0006.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0007.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0008.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0009.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0010.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0011.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0012.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0013.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0014.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0015.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0016.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0017.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0018.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0019.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0020.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0021.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0022.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0023.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0024.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0025.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0026.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0027.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0028.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0029.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0030.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0031.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0032.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0033.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0034.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0035.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0036.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0037.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0038.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0039.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0040.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0041.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0042.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0043.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0044.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0045.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0046.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0047.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0048.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0049.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0050.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0051.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0052.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0053.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0054.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0055.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0056.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0057.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0058.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0059.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0060.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0061.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0062.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0063.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0064.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0065.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0066.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0067.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0068.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0069.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0070.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0071.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0072.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0073.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0074.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0075.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0076.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0077.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0078.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0079.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0080.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0081.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0082.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0083.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0084.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0085.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0086.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0087.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0088.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0089.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0090.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0091.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0092.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0093.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0094.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0095.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0096.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0097.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0098.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0099.png",
            "C:/Users/Thane_Acheron/Documents/NetBeansProjects/VideoDrone/src/VDAnimation/0100.png",
        };
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        for(int i = 0; i < creatureImg.length;i++) {
            creatureImg[i] = toolkit.getImage(imgs[i]);
        }  
        
        if(runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }
    
    public void run() {
        while(runner == Thread.currentThread()){
           pic++;
            if(pic == 100){
               runner.stop();
           }      
           try {
              Thread.sleep(70);
          } catch(InterruptedException ie) {}
           repaint();
        }
    }
    
    public void paintComponent(Graphics screen){
       Graphics2D screen2D = (Graphics2D)screen;
       
       if (pic < 100)
       {
       screen2D.drawImage(creatureImg[pic], 0, 0, this);
       }
       else 
       {
       screen2D.drawImage(creatureImg[99], 0, 0, this);
       }
    }
}