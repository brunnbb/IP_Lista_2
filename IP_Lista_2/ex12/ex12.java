
package ip_lista_2;

import java.util.Scanner;

/**
 * Faça um programa que leia dois números A e B e mostre se eles são iguais.
 */
public class ex12 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float x, y;
    boolean z;
   
    System.out.println("Esse algoritmo determina se dois numeros sao iguais. ");
    System.out.println("Digite o primeiro numero.");
    x = Float.parseFloat(input.nextLine());
    System.out.println("Digite o segundo numero.");
    y = Float.parseFloat(input.nextLine());
    z = x==y;
    System.out.println("Os numeros sao iguais: "+z);}
}
