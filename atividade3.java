package estruturarepetiçao;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int somaimpar =0,somapar =0,num =0 ; 
		for (int i=1;  i<=10; i++) {
			System.out.println("Informe o numero:");
			num = ler.nextInt ();
			if(num %2 ==0) {
			somapar ++;
			}
			else {
			somaimpar++;
			}}
				System.out.println("A quantidade de numero pares é:" + somapar);
		        System.out.println("A quantidade de numeros impares é:" + somaimpar);
		        ler.close ();
}}