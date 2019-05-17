package com.br.aula.java;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int controle = 1;
		while (controle > 0) {
			System.out.println("Qual sua idade?");
			int idade = scan.nextInt();
			
			
			System.out.println("Qual sua renda?");
			double renda = scan.nextDouble();
			
			
			System.out.println("Quanto vc quer pedir");
			double valorPedido = scan.nextDouble();
			
			int juros = 3;
			double valorTotal = valorPedido + (((valorPedido * juros)/100)*12);
			
			if (idade >= 25 && idade <= 60) {
				if(renda > 1500) {
					if(valorPedido >= 1000 && valorPedido <= renda * 10) {
						System.out.println("Valor aceito. "
								+ "Parabens campeão. Vc vai receber "+valorPedido
								+", mas vai pagar"+ valorTotal);
					}else {
						System.out.println("Está fora do contrato. Consulte o maldito gerente");
					}
				}else {
					System.out.println("A renda não é suficiente");
				}
			}else {
				System.out.println("Sua idade não se encaixa no contrato. Consulte o gerente");
			}
			
			System.out.println("Digite 1 para continuar no programa ou -1 para sair");
			controle = scan.nextInt();
		}
	
	}

}
