
package ip_lista_2;

import java.util.Scanner;

/**
 *Crie um programa para auxiliar engenheiros a calcular a quantidade de piso a ser
utilizado em uma sala retangular, a quantidade de tinta a ser gasta nas paredes, bem
como a potência do ar-condicionado. 
* Para isto, o programa deve ler o comprimento, a
largura e a altura da sala, calcular e imprimir a área de piso da sala, a área total das
paredes e o volume da sala. 
* O programa deve mostrar também o tamanho do aparelho de ar-condicionado a ser instalado. 
* Um pequeno deve ser instalado se o volume da sala for inferior a 100 m³ ; um aparelho médio deve ser instalado se o volume da sala estiver entre 100 e 500 m³; e um aparelho grande deve ser instalado caso o volume seja superior a 500m³.
 */
public class ex7 {
    
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int a, c, l, apiso, aparede, v;
   boolean ap, am, ag;
    
   System.out.println("Esse algoritmo determina a area do piso, das paredes e o volume de uma sala retangular.");
   System.out.println("Determinando também qual aparelho de ar condicionado deve ser usado");
   System.out.println("Todos os dados devem ser dados em metros.");
   System.out.println("Digite a altura da sala");
   a = Integer.parseInt(input.nextLine());
   System.out.println("Digite o comprimento da sala");
   c = Integer.parseInt(input.nextLine());
   System.out.println("Digite a largura da sala");
   l = Integer.parseInt(input.nextLine());
   apiso = c*l;
   aparede = 2*(a*c)+2*(a*l);
   v = c*a*l;
   ap = 100>v;
   am = (100<v)&&(500>v);
   ag = 500<v;
   System.out.println("O valor da area do piso da sala: "+apiso);
   System.out.println("O valor do volume da sala: "+v);
   System.out.println("O valor da area das paredes: "+aparede);
   System.out.println("Deve ser instalado um ar pequeno: "+ap);
   System.out.println("Deve ser instalado um ar medio: "+am);
   System.out.println("Deve ser instalado um ar grande: "+ag);}  
}
