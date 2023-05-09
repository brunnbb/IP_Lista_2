
package ip_lista_2;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro entre 0 e 999 e apresente a soma dos seus dígitos. 
 * Por exemplo, se o número digitado por 284 o resultado será igual a 14 (2+8+4).
 */
public class ex19 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int x, cent, dez, uni, soma;
   
   System.out.println("Esse algoritmo le um número inteiro entre 0 e 999 e apresente a soma dos seus dígitos. ");
   System.out.println("Digite o numero.");
   x = Integer.parseInt(input.nextLine());
   cent = x/100;
   dez = (x%100)/10;
   uni = (x%100)%10;
   soma = cent+dez+uni;
   System.out.println("A soma dos seus digitos e: "+soma);
   }}