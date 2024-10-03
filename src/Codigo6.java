import java.util.Scanner;

public class Codigo6 {
	
	public static void main (String[] args) { // Se agrega main
	  
	    int[] num = new int[20]; // Se corrige arreglo de 20 números enteros

	    for (int i = 0; i < 20; i++) { // Se corrige incremento de + a ++
	      num[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(num[i] + " "); // Se corrige línea print a println
	    }// for
	    
	    Scanner sc = new Scanner(System.in); // Se apertura la función Scanner y se importa
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); // Se corrige printl a println
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		int opcion = Integer.parseInt(sc.nextLine()); // Se corrige línea para lectura del valor

	    int multiplo = (opcion == 1) ? 5 : 7; // Se corrige órden de : y ?

	    for (int e : num) { // Se corrige foreach por for para el uso correcto y se cambia char por int
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {
	        System.out.print(e + " "); // Se corrige in por out
	       }// else
	      }// for
	    sc.close(); // Se cierra Scanner
	}// main
}// class Codigo6