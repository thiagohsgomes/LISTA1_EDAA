import java.util.Random; 

public class Main {
	
	public static void main(String[] args) { 
		
		Random grd = new Random();
		
		int vet[] = new int [10]; 
		boolean flag = true;
		
		for (int i = 0; i < 10; i++) {
			vet[i] = grd.nextInt(10);
			System.out.println("Posição " + i + " = " + vet[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < vet.length; i++) { 
			for (int j = 2; j < vet[i]; j++) {
				if(vet[i] % j == 0) { 
					flag = false;
				}
			}
			if (flag && vet[i] >= 2) {
				System.out.println(vet[i] + " é primo e sua posição é a: " + i + " no vetor");
			}
			
			flag = true;
		}
	}
		
}