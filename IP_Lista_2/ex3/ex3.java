
package ip_lista_2;

import java.util.Scanner;

/**
 *Crie uma nova versão do programa da questão 2 para que ele mostre uma mensagem indicando se a residência está com consumo elevado de energia. 
 *A empresa considera consumo elevado de energia, se a residência consumir mais de de 70 quilowatts.
 */
public class ex3 {
   public static void main(String[] args) { 
   Scanner input = new Scanner(System.in);
   double p, q, conta, atraso;
   boolean elevado;
	 
   System.out.println("Esse algoritmo determina a conta de energia paga em dia e em atraso. ");
   System.out.println("Digite o preco do quilowatt");
   p = Double.parseDouble(input.nextLine());
   System.out.println("Digite a quantidade de quilowatts");
   q = Double.parseDouble(input.nextLine());
   conta = p*q;
   atraso = conta+conta*0.1;
   elevado = q>70;
   System.out.println("O valor da conta: "+conta);
   System.out.println("O valor da conta atrasada: "+atraso);
   System.out.println("O consumo esta elevado: "+elevado); }  
}
