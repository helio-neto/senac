package Main;

import java.util.logging.Level;
import java.util.logging.Logger;
import ExerciciosAula.*;

import ThreadsEdu.*;

public class MainAps2 {

	public static void main(String[] args) {
		/*
		 * Exemplo com MeuThread1
		 
        new MeuThread1().start();
        
        MeuRunnable1 meuRunnable = new MeuRunnable1();
        new Thread(meuRunnable).start();
        
        for(int i=0;i<10;i++){
            System.out.println("Main: "+i);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
		*/
		/*
		 * Exemplo com MeuThread2
		 
		for(int i=1; i<11;i++)
            new MeuThread2("Multiplos de "+i,i,i*10).start();
        */
		
		/*
    	 *  Números Pares e Ímpares
    	 */
    	EvenNum even = new EvenNum();
        new Thread(even).start();
        
        OddNum odd = new OddNum();
        new Thread(odd).start();
        
	}

}
