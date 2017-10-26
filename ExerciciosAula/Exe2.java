package ExerciciosAula;
import java.lang.Math;
import java.util.ArrayList;

public class Exe2 {
	
	private int[] vetor = new int[200];
	public static ArrayList<Integer> ArrayRandom = new ArrayList<Integer>() ;
	
	/*
	 * Utilizando Vetor
	 */
	public void createVetor(){
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 200);
		}		
	}
	public void printVetor(){
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}	
	}
	
	/*
	 * Utilizando Array
	 */
	public void createArray(){
		for (int i = 0; i < 200; i++) {
			ArrayRandom.add((int) (Math.random() * 200));
		}
	}
	
	public void printArray(){
		System.out.println(ArrayRandom);
		System.out.println("Size : "+ArrayRandom.size());
		
	}
	
	public void searchArray(int tn, int searchInt){
		int chunck_size = (int) Math.floor(ArrayRandom.size()/tn);
		
		System.out.println("Chunks : "+chunck_size);
		
		for (int i = 0; i < tn; i++){
			int begin = i*chunck_size;
			int end = begin+chunck_size-1;
			if(i < tn -1){
				//new Thread(new SearchThread("Thread 1 -", searchInt, begin, end)).start();
				System.out.println("[ "+(begin)+" : "+(end)+" ]");
			}else{
				end = ArrayRandom.size()-1;
				//new Thread(new SearchThread("Thread 1 -", searchInt, begin, end)).start();
				System.out.println("[ "+(begin)+" : "+(end)+" ]");
			}
			new Thread(new SearchThread("Thread "+i+" -", searchInt, begin, end)).start();
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ArrayRandom == null) ? 0 : ArrayRandom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exe2 other = (Exe2) obj;
		if (ArrayRandom == null) {
			if (other.ArrayRandom != null)
				return false;
		} else if (!ArrayRandom.equals(other.ArrayRandom))
			return false;
		return true;
	}
 
}
