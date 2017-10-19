package ExerciciosAula;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exe1 implements Runnable{
	
	private String nome;
    private int multiplo, inicio;
    private ArrayList<Integer> ArrayResponse = new ArrayList<Integer>() ;

    public Exe1(String nome, int multiplo, int inicio) {
		this.nome = nome;
		this.multiplo = multiplo;
		this.inicio = inicio;
	}

	@Override
    public void run() {
		for(int i=inicio; i<=100; i+=multiplo){
			ArrayResponse.add(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Exe1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
		System.out.println(nome+ArrayResponse);
    }
    
}