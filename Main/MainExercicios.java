package Main;

import ExerciciosAula.*;
import Utils.*;

public class MainExercicios {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 1
		 
		int ni = Console.scanInt("Digite o n� de threads desejado : ");
		
		for(int i=1; i<=ni;i++)
			new Thread(new Exe1("Meu Thread "+i+" - ",ni,i)).start();
		*/
		
		Exe2.createArray();
		Exe2.printArray();
	}

}
