package estruturarepetiçao;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v,m,som=0;
Scanner ler = new Scanner(System.in);
for(double i =0; i<=4; i++) {		
System.out.println("Informe o número:");
		v= ler.nextDouble ();
		som+= v;
}
m=som/5;
System.out.println("sua média foi:"+m);
	ler.close();
}}