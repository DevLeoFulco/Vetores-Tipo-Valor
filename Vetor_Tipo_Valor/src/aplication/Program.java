package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alturas que deseja adicionar seguido das alturas : ");
		int n = sc.nextInt();
		double[] vet = new double [n];
		
		for (int i=0; i<n; i++) {
			vet[i]= sc.nextDouble();
		}
		 double soma = 0.0;
		 for (int i=0; i<n; i++) {
			 soma += vet[i];
		 }
		 
		 double media = soma/n;
		 
		 System.out.println("A media das altura é : "+ media);
		sc.close();
	}

}