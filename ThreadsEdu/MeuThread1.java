package ThreadsEdu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MeuThread1 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Meu Thread: "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
