import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor_roubado[] = new int[10]; 
		int valor_roubado_total = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Valor escondido com o suspeito " + (i + 1) + ":");
			valor_roubado[i] = entrada.nextInt();
		}
		
		System.out.println();
		System.out.print("Menor quantia roubada: "); 
		int menor_quantia_roubada = entrada.nextInt(); 
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			if (valor_roubado[i] % 10 == 0 && valor_roubado[i] >= menor_quantia_roubada) {
				valor_roubado_total += valor_roubado[i];
				System.out.println("O bandido de posição " + i + " do vetor roubou R$" + valor_roubado[i]);
			} 
		}
	
		System.out.println();
		System.out.println("O valor total do roubo é R$" + valor_roubado_total);
		
		entrada.close();
		
	}
}
