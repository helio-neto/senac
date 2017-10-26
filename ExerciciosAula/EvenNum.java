package ExerciciosAula;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenNum implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=100; i++){
        	if (i%2 == 0) {
        		System.out.println("Even Number: "+i);
			}
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(EvenNum.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}