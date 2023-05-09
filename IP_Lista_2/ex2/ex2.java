
package ip_lista_2;

import java.util.Scanner;

/**
 * Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de quilowatts em uma residência. 
 * O programa deve calcular e imprimir o valor a ser pago pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga em atraso. 
 * Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da conta. 
 * O programa não deve perguntar se a conta será paga em atraso ou não; 
 * ele deve sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e decida se vai pagar a conta em dia ou não. 
 */
public class ex2 {
    
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   double p, q, conta, atraso;
	 
   System.out.println("Esse algoritmo determina a conta de energia paga em dia e em atraso. ");
   System.out.println("Digite o preco do quilowatt");
   p = Double.parseDouble(input.nextLine());
   System.out.println("Digite a quantidade de quilowatts");
   q = Double.parseDouble(input.nextLine());
   conta = p*q;
   atraso = conta+conta*0.1;
   System.out.println("O valor da conta: "+conta);
   System.out.println("O valor da conta atrasada: "+atraso);
   }
}
