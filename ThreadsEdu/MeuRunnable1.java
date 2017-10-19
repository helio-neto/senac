package ThreadsEdu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MeuRunnable1 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("MeuRunnable: "+i);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuRunnable1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
