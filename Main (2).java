/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
        
        /*		
		int lin = 3;
		int tabela [][] = new int[lin][2];
		tabela[0][0] = 0;
 		tabela[0][1] = 1;
		tabela[1][0] = 2;
		tabela[1][1] = 3;
		tabela[2][0] = 4;
		tabela[2][1] = 5;
		
		
		int tabel[][]= {{0, 1}, {2,3}};
		int soma = tabela[0][1] + tabela[1][1];
		System.out.println(soma);
		//imprime: 4
		
		int col;
		int in;
		for(int i = 0; i < lin; i++){
		    for(int j = 0; j < col;j++){
		        System.out.println(tabela[i][j] + " ");
		    }
		    System.out.println(" ");
		}
		//imprime:0 1
		//imprime:2 3
		*/ 
		
		Scanner  l = new Scanner (System.in);
		int lin = l.nextInt();
		int tabela[][] = new int[3][3];
		tabela[1][1] =  1;
		tabela[2][1] = 2;
	}
}
