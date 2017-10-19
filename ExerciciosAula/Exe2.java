package ExerciciosAula;
import java.lang.Math;
import java.util.ArrayList;

public class Exe2 {
	
	private static int[] vetor = new int[200];
	private static ArrayList<Integer> ArrayRandom = new ArrayList<Integer>() ;
	
	/*
	 * Utilizando Vetor
	 */
	public static void createVetor(){
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 200);
		}
		
	}
	public static void printVetor(){
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}
	
	/*
	 * Utilizando Array
	 */
	public static void createArray(){
		for (int i = 0; i < 200; i++) {
			ArrayRandom.add((int) (Math.random() * 200));
		}
	}
	
	public static void printArray(){
		System.out.println(ArrayRandom);
		System.out.println("Size : "+ArrayRandom.size());
		System.out.println("Chunks : "+ArrayRandom.size()/3);
		for (int i = 0; i+ArrayRandom.size()/3 <=200; i+=ArrayRandom.size()/3){
			System.out.println(i+ArrayRandom.size()/3);
		}
		
	}
	
	
}
