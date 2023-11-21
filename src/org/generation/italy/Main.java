package org.generation.italy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Sort (ordinamento)	
		
		
		//NEL CASO DI ARRAYLIST:
		System.out.println("**** ORDINAMENTO ARRAYLIST ****");
		ArrayList<String> elencoStudenti=new ArrayList<>();
		
		elencoStudenti.add("Samuele");
		elencoStudenti.add("Ion");
		elencoStudenti.add("Simone");
		elencoStudenti.add("Alice");
		
		System.out.println("Prima dell'ordinamento:");
		System.out.println(elencoStudenti);
		
		//Ordinamento:
		Collections.sort(elencoStudenti);
		
		System.out.println("Dopo l'ordinamento:");
		System.out.println(elencoStudenti);
		
		//Ordinamento decrescente:
		Collections.sort(elencoStudenti, Collections.reverseOrder());
		System.out.println("In maniera decrescente:");
		System.out.println(elencoStudenti);

		
		//NEL CASO DI ARRAY:
		System.out.println("\n\n\n**** ORDINAMENTO ARRAY ****");
		int[] numeri= {8,2,9,-2,0,23,12};
		System.out.println("Prima dell'ordinamento:");
		for (int n:numeri)
			System.out.print(n+"  ");
		
		Arrays.sort(numeri);
		System.out.println("\n\nDopo l'ordinamento:");
		for (int n:numeri)
			System.out.print(n+"  ");
		
		System.out.println("\n\nReversed:");
		for (int i=numeri.length-1;i>=0;i--)
			System.out.print(numeri[i]+"  ");
		
		
	}

}
