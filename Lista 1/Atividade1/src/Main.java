
public class Main {

	public static void main(String[] args) {

        int mat [][] = new int [10][10];
        int x = 0;
        for (int i = 0; i < 10; i++) {
             System.out.println("Tabuada do " + i);
             for (int j = 0; j < 10; j++) {
                  mat[i][j] = x;
                  x++;
                  int soma = i + j;
                  System.out.println("["+i+"]" + "+" +"["+j+"] = " + soma );
             }
             System.out.println();
        } 		
	}

}
