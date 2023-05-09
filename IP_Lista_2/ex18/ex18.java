
package ip_lista_2;

import java.util.Scanner;

/**
* Faça um programa que leia o dia, o mês e o ano de nascimento de uma pessoa e o
dia, mês e ano atual. 
* Em seguida, o programa deve calcular e apresentar quantos dias a pessoa já viveu 
(considere que todos os meses têm 30 dias e, por consequência, cada ano tem 360 dias).
 */

public class ex18 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int d, m, a, d1, m1, a1, Y, D, D1, vivo;
   
   System.out.println("Esse algoritmo calcula quantos dias uma pessoa ja viveu. ");
   System.out.println("Digite a data do seu nascimento no modelo dd//mm/aaaa");
   d = Integer.parseInt(input.nextLine());
   m= Integer.parseInt(input.nextLine());
   a = Integer.parseInt(input.nextLine());
   System.out.println("Digite a data atual no modelo dd/mm/aaaa.");
   d1 = Integer.parseInt(input.nextLine());
   m1 = Integer.parseInt(input.nextLine());
   a1 = Integer.parseInt(input.nextLine());
   Y =(a1-a)*360;
   D = m*30 + d;
   D1 = m1*30+d1;
   vivo = Y+(D1-D);
   System.out.println("A pessoa ja viveu "+vivo+" dias.");}   
}
