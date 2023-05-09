
package ip_lista_2;

import java.util.Scanner;

/**
 *Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e imprima o seu índice de massa corporal, usando a seguinte fórmula: 
 *IMC = Peso / Altura². Além do IMC, o programa deve mostrar se a pessoa está acima do peso ideal (IMC > 25).   
 */
public class ex4 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        double p, a, imc;
        boolean acima;
	 
        System.out.println("Esse algoritmo calcula o IMC e determina se uma pessoa esta acim do peso ideal. ");
        System.out.println("Digite o peso desejado");
        p = Double.parseDouble(input.nextLine());
        System.out.println("Digite a altura desejada");
        a = Double.parseDouble(input.nextLine());
        imc = p/(a*a);
        acima = imc > 25;
        System.out.println("O IMC da pessoa e: "+imc);
        System.out.println("Essa pessoa esta acima do peso: "+acima);}
    } 

