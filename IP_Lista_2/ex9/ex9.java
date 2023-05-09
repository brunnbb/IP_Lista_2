
package ip_lista_2;

import java.util.Scanner;

/**
 * Escreva um programa que leia o valor da compra e o valor pago pelo cliente. 
 * O programa deve calcular e apresentar, o valor da compra, o valor pago pelo cliente; 
 * o valor do troco e a quantidade de notas que deve ser dada de cada tipo para formar este troco. 
 * O troco deve ser dado de forma a minimizar a quantidade de notas distribuídas.
 */
public class ex9 {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int c, p, vt, n100, n10, n1;
   
    System.out.println("Esse algoritmo determina determina o valor do troco de uma compra. ");
    System.out.println("Ele foca na menor quantidade possivel de notas para o troco.");
    System.out.println("Digite o valor da compra.");
    c = Integer.parseInt(input.nextLine());
    System.out.println("Digite o valor pago pelo cliente.");
    p = Integer.parseInt(input.nextLine());
    vt = p-c;
    n100 = vt/100;
    n10 = (vt%100)/10;
    n1 = (vt%100)%10;
    System.out.println("O valor do troco: "+vt);
    System.out.println("O numero de notas de 100: "+n100);
    System.out.println("O numero de notas de 10: "+n10);
    System.out.println("O numero de notas de 1: "+n1);}
}
