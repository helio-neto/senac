package ThreadsEdu;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MeuThread2 extends Thread{
    private String nome;
    private int multiplo, maximo;

    public MeuThread2(String nome, int multiplo, int maximo) {
        this.nome = nome;
        this.multiplo = multiplo;
        this.maximo = maximo;
    }
    
    
    
    @Override
    public void run(){
        for(int i=multiplo; i<=maximo; i+=multiplo){
            System.out.println(nome+": "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MeuThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

