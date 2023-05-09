/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip_lista_2;

import java.util.Scanner;

/**
 * Faça um programa que leia o salário bruto e o número de dependentes de um funcionário e calcule o seu salário líquido. 
 * Para calcular o salário líquido, deve-se descontar:
 * 11% de INSS;
 * 15% de Imposto de renda.
 * Após os descontos, deve-se adicionar um auxílio de R$ 150,00 por dependente.
 */

public class ex15 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   double sb, inss, imp, sl;
   int dep;
   
   System.out.println("Esse algoritmo calcula o salário líquido de um individuo. ");
   System.out.println("Digite o salario bruto.");
   sb = Double.parseDouble(input.nextLine());
   System.out.println("O numero de dependentes.");
   dep = Integer.parseInt(input.nextLine());
   inss = sb*0.11;
   imp = sb*0.15;
   sl = (sb - imp - inss)+150*dep;
   System.out.println("O salario liquido e: "+sl);}
}
