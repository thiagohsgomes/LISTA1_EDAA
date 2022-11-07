import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] array = {10, 20, 5, 39, 50};
		boolean [] array_controle = {true, true, true, true, true};
		
		for (int i = 0; i < 5; i++) {
			System.out.print("[" + array[i] + "]"); 
		}
		
		System.out.println(); 
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (array_controle[j] == true) { 
					System.out.print("Deseja alterar o valor " + array[j] + " de posição " + j + "? S OU N: ");
					String escolha = entrada.next();
					System.out.println();
					switch(escolha) { 
					case "S":
						System.out.print("Digite o novo valor: ");
						array[j] = entrada.nextInt(); 
						array_controle[j] = false; 
						System.out.println();
						
						break;
						
					case "N": 
						break;
						
					}
					
					for (int x = 0; x < 5; x++) { 
						System.out.print("[" + array[x] + "]");
					}
					
						System.out.println(); 
						System.out.println();
				}
						
				else {
					break; 
				}
			} 
		}
		entrada.close();
	}
}
