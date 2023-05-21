package application;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Progama Matriz Primaria");

		System.out.println("Esse programa cria uma matriz e localiza um valor especifico indicado e apresentar os valores dos seus elementos vizinhos.");

		System.out.print("\nInforme o numero de linhas da matriz: ");
		int m = sc.nextInt();
		System.out.print("Informa o numero de colunas da matriz: ");
		int n = sc.nextInt();
		
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i<mat.length; i++) {
			System.out.printf("Informe o valor da %dª linha.\n", i+1);
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nInforme o valor procurado: ");
		int x = sc.nextInt();
		System.out.println();

		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					
									
					
					if(j > 0 ) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i > 0 ) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i < mat.length -1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
							
					
				}
			}
		}
		
		
		
		sc.close();
	}
}
