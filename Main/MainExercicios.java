package Main;

import ExerciciosAula.*;
import Utils.*;

public class MainExercicios {

	public static void main(String[] args) {
		/*
		 * Exercício 1
		 
		int ni = Console.scanInt("Digite o nº de threads desejado : ");
		
		for(int i=1; i<=ni;i++)
			new Thread(new Exe1("Meu Thread "+i+" - ",ni,i)).start();
		*/
		
		Exe2 modelArray = new Exe2();
		
		int nt = Console.scanInt("Digite o nº de threads desejado : ");
		int ni = Console.scanInt("Digite o nº a ser procurado : ");
		modelArray.createArray();
		modelArray.printArray();
		modelArray.searchArray(nt, ni);
		// Exe2.createArray();
		// Exe2.printArray();
	}

}
