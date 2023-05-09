
package ip_lista_2;

import java.util.Scanner;

/**
 *Considere que o último concurso vestibular apresentou três provas: Português,
Matemática e Conhecimentos Gerais. Para cada candidato tem-se um registro
contendo o seu nome e as notas obtidas em cada uma das provas. Construa um
programa que leia estes dados e apresente:
a) o nome e as notas em cada prova do candidato.
b) a média do candidato.
c) uma informação dizendo se o candidato foi aprovado ou não. Considere que um
candidato é aprovado se sua média for maior que 7.0 e se não apresentou
nenhuma nota abaixo de 5.0
 */

public class ex14 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   double p, m, cg, media;
   String nome;
   boolean aprovado;
   
   System.out.println("Esse algoritmo calcula os gastos com combustível em uma viagem. ");
   System.out.println("Digite o nome do aluno.");
   nome = input.nextLine();
   System.out.println("Digite a nota em portugues.");
   p = Double.parseDouble(input.nextLine());
   System.out.println("Digite a nota em matematica.");
   m = Double.parseDouble(input.nextLine());
   System.out.println("Digite a nota em conhecimentos gerais.");
   cg = Double.parseDouble(input.nextLine());
   media = (p+m+cg)/3;
   aprovado = (media>7)&&(p>5)&&(m>5)&&(cg>5);
   System.out.println("O candidato "+nome+" apresentou as seguintes notas: Em portuges: "+p+" Em matematica: "+m+" Em conhecimentos gerais: "+cg);
   System.out.println("O candidato "+nome+" apresentou a seguinte media: "+media);
   System.out.println("O candidato foi aprovado: "+aprovado);}  
}
