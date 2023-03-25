
package guia3;

import java.util.Timer;
import java.util.TimerTask;

public class Temporizador0 {
    Timer timer;
    public Temporizador0(int segundos){
        timer=new Timer();
        timer.schedule(new Recordarotio(),segundos*1000);
    }

  class Recordarotio extends TimerTask {

      
      
        public void run() {
            System.out.println("Tiene un recordatorio!");
            timer.cancel();
        }
    }
    
    }
