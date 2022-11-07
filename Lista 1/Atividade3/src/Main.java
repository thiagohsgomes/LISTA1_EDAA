import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		String [] carro = {"Gol", "Punto", "Toro", "Onix", "Fusca"}; double [] consumo = {10.0, 8.4, 7, 15.2, 12.3};
		double [] consumo_1000 = new double[5];
		double menor_consumo = 999;
		String carro_menor_consumo = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (consumo[j] < menor_consumo) { 
					menor_consumo = consumo[j];
					carro_menor_consumo = carro[j];
				}
			}
		}
		
		System.out.println("Carro de menor consumo: " + carro_menor_consumo);
		System.out.println("Menor consumo: " + menor_consumo); 
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				consumo_1000[j] = 1000 / consumo[j];
			}
			
			System.out.println("O carro de modelo " + carro[i].toUpperCase() + " gastaria cerca de " + new DecimalFormat("#,##0.00").format(consumo_1000[i]) + "L de combustível para percorrer 1000km.");
		} 
	}
}
