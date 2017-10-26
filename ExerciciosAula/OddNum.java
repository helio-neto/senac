package ExerciciosAula;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OddNum implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=100; i++){
        	if (i % 2 != 0) {
        		System.out.println("Odd Number: "+i);
			}
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(OddNum.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}