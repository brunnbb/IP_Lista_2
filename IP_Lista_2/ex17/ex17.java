
package ip_lista_2;

import java.util.Scanner;

/**
 * Faça um programa que leia a quantidade total de parcelas de um consórcio, a
quantidade de parcelas já pagas e o valor de cada parcela (considere que todas as
parcelas tem o mesmo valor). 
* O programa deve calcular e apresentar o total já pago pelo cliente e qual é o seu saldo devedor.
 */

public class ex17 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int pt, pp;
   double vp, Tpago, Tdeve;

   System.out.println("Esse algoritmo calcula o valor ja pago e o saldo devedor de um determinado consorcio. ");
   System.out.println("Digite a quantidade total de parcelas.");
   pt = Integer.parseInt(input.nextLine());
   System.out.println("Digite a quantidade de parcelas ja pagas.");
   pp = Integer.parseInt(input.nextLine());
   System.out.println("Digite o valor de cada parcela.");
   vp = Double.parseDouble(input.nextLine());
   Tpago = pp*vp;
   Tdeve = pt*vp-Tpago;
   System.out.println("O total ja pago pelo cliente e: "+Tpago);
   System.out.println("O total do saldo devedor do cliente e: "+Tdeve);}
}
    
