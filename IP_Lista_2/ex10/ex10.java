
package ip_lista_2;

import java.util.Scanner;

/**
 * Desafio sobre estranhas condições necessárias para um avião decolar
 */
public class ex10 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   double pist, peso, visi, chuva;
   int passa;
   boolean auto, c1, c2, c3, c4, c5, c6, c7, c8, decola;

   
   System.out.println("Esse algoritmo calcula se um aviao pode ou nao decolar de um aeroporto. ");
   System.out.println("Digite o comprimento da pista em km.");
   pist = Double.parseDouble(input.nextLine());
   System.out.println("Digite o peso da aeronave em toneladas.");
   peso = Double.parseDouble(input.nextLine());
   System.out.println("Digite a visibilidade em metros. ");
   visi = Double.parseDouble(input.nextLine());
   System.out.println("Digite a intesidade da chuva em mm. ");
   chuva = Double.parseDouble(input.nextLine());
   System.out.println("Digite a quantidade de passageiros.");
   passa = Integer.parseInt(input.nextLine());
   System.out.println("A aeronave possui sistema de decolagem automatizada?(true/false).");
   auto = Boolean.parseBoolean(input.nextLine());
   c1 = (pist<1.5)&&(peso<40);
   c2 = ((1.5<=pist)||(pist<=2))&&(peso<60);
   c3 = pist>2;
   c4 = (visi<20)&&(auto);
   c5 = (visi>=20);
   c6 = !(chuva>5);
   c7 = chuva<=5;
   c8 = !((passa>100)&&chuva>0);
   decola = (c1||c2||c3)&&(c4||c5)&&(c6||c7)&& c8;
   System.out.println("A aeronave decolara: "+decola);
 }
}
