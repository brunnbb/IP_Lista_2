
package ip_lista_2;

import java.util.Scanner;

/**
 * Faça um programa que calcule os gastos com combustível em uma viagem.
 * O programa deve solicitar ao usuário a distância a ser percorrida em Km,
 * o consumo médio do carro (quantos quilômetros o carro percorre com um litro de combustível) em Km/litro e o preço do litro do combustível. 
 * O programa deve calcular e apresentar o valor em R$ a ser gasto com combustível na viagem.
 */
public class ex11 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   float d, c, p, l, gastos;
   
   System.out.println("Esse algoritmo calcula os gastos com combustível em uma viagem. ");
   System.out.println("Digite a distancia a ser percorrida em Km.");
   d = Float.parseFloat(input.nextLine());
   System.out.println("Digite o consumo médio do carro em Km/litro.");
   c = Float.parseFloat(input.nextLine());
   System.out.println("Digite o o preço do litro do combustível em reais.");
   p = Float.parseFloat(input.nextLine());
   l = d/c;
   gastos = l*p;
   System.out.println("Os gastos totais em reais foram: "+gastos);}   
}
