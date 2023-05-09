
package ip_lista_2;

import java.util.Scanner;

/**
 * Faça um programa que leia os valores A, B e C e informe se a soma de A com B é menor ou igual a C.
 */
public class ex13 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   float a, b, c;
   boolean w, z;
   
   System.out.println("Esse algoritmo determina se a soma dois numeros sao iguais a um terceiro. ");
   System.out.println("Digite o primeiro numero.");
   a = Float.parseFloat(input.nextLine());
   System.out.println("Digite o segundo numero.");
   b = Float.parseFloat(input.nextLine());
   System.out.println("Digite o terceiro numero.");
   c = Float.parseFloat(input.nextLine());
   w = a+b==c;
   z = a+b<c;
   System.out.println("A soma dos dois primeiros e igual ao terceiro: "+w);
   System.out.println("A soma dos dois primeiros e menor que o terceiro: "+z);}
}
