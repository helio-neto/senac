package ExerciciosAula;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exe1 implements Runnable{
	
	private String nome;
    private int multiplo, inicio;

    public Exe1(String nome, int multiplo, int inicio) {
		this.nome = nome;
		this.multiplo = multiplo;
		this.inicio = inicio;
	}

	@Override
    public void run() {
		for(int i=multiplo; i<=100; i+=multiplo){
            System.out.println(nome+": "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Exe1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}