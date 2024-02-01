package project;

import java.util.Scanner;

public class BolsaFaculdade {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner (System.in);
		
		System.out.print("Informe sua media: ");
		double media = enter.nextDouble();
		
		boolean bolsaFaculdade = media >= 8.5;
		if(bolsaFaculdade){
			System.out.println("Parabens!");
			System.out.println("Você está ganhou a Bolsa de Estudos!");
		}
		
		boolean naoConseguilABolsa = media < 8.5;
		 if(naoConseguilABolsa){
			 System.out.println("Você não conseguil a Bolsa de Estudos!");
		 }
		
		
		enter.close();
	}
}
