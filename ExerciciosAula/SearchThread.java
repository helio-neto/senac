package ExerciciosAula;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchThread implements Runnable{
	
	private String nome;
    private int numero, inicio, fim;
    private boolean found = false;

    public SearchThread(String nome, int numero, int inicio, int fim) {
		this.nome = nome;
		this.numero = numero;
		this.inicio = inicio;
		this.fim = fim;
	}

	@Override
    public void run() {
		for(int i=inicio; i<=fim; i++){
			
            try {
            	if (Exe2.ArrayRandom.get(i) == (numero)) {
            		System.out.println("Thread "+nome+" | "+i);
            		found = true;
        		} 
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Exe1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
		if (found == false){
			System.out.println(this.nome+" não achou");
		}
			
    }
    
}
