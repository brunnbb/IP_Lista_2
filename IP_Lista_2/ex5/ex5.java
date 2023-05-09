
package ip_lista_2;

import java.util.Scanner;

/**
 * Osistema de avaliação de uma disciplina é composto de duas provas e um trabalho. 
 * Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota igual ou superior a seis em pelo menos uma das provas. 
 * Observe que não se deve calcular a média das notas. 
 * Faça um programa que leia as três notas do aluno e apresente se ele deve ser aprovado ou não.
 */
public class ex5 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int p1, p2, t;
        boolean x, y, z;
	 
        System.out.println("Esse algoritmo se um aluno doi aprovado. ");
        System.out.println("Digite a nota da prova 1");
        p1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite a nota da prova 2");
        p2 = Integer.parseInt(input.nextLine());
        System.out.println("Digite a nota do trabalho");
        t = Integer.parseInt(input.nextLine());
        x = t>=7;
        y = (p1>=6)||(p2>=6);
        z = x&&y;
        System.out.println("O aluno foi aprovado: "+z);}
    } 

