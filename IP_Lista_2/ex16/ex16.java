/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip_lista_2;

import java.util.Scanner;

/**
 * Faça um programa que leia o preço de três mercadorias no dia 01/01/2022 e o no dia 01/02/2022. 
 * Em seguida o programa deve calcular a inflação do período, considerando a variação de preço dos três produtos. 
 * Mostre uma mensagem se a inflação está acima da meta ou não (considere que a meta para o mês é de 0,55%).
 */

public class ex16 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   double x, y, z, x1, y1, z1, X, Y, Z, M, me;
   boolean infla;

   System.out.println("Esse algoritmo calcula taxa de inflacao de tres produtos em um espaco de um mes. ");
   System.out.println("Digite o antigo preco do primeiro produto.");
   x = Double.parseDouble(input.nextLine());
   System.out.println("Digite o antigo preco do segundo produto.");
   y = Double.parseDouble(input.nextLine());
   System.out.println("Digite o antigo preco do terceiro produto.");
   z = Double.parseDouble(input.nextLine());
   System.out.println("Digite o preco atual  do primeiro produto.");
   x1 = Double.parseDouble(input.nextLine());
   System.out.println("Digite o preco atual do segundo produto.");
   y1 = Double.parseDouble(input.nextLine());
   System.out.println("Digite o preco atual do terceiro produto.");
   z1 = Double.parseDouble(input.nextLine());
   X = (x1/x)-1;
   Y = (y1/y)-1;
   Z = (z1/z)-1;
   M = (X+Y+Z)/3;
   me = M*100;
   infla = me>0.55;
   System.out.println("A inflacao esta acima da meta: "+infla);
   }
}
