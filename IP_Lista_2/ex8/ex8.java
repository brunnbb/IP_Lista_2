
package ip_lista_2;

import java.util.Scanner;

/**
 * Sabendo que a velocidade do som é de 340 m/s, crie um programa para calcular a
distância de onde o raio caiu até a pessoa. 
* Para isto, a pessoa deve informar o tempo que transcorreu entre ela ter visto o raio e ter ouvido o som do trovão. 
* O tempo deve ser informado em segundos e deve ser um valor real, pois a pessoa poderá usar um cronômetro de precisão. 
* Além disto, o programa deve apresentar se o raio representou algum perigo a pessoa. 
* Um raio representa perigo se ele cair a menos de 200m da pessoa.
 */
public class ex8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double t, d;
    boolean perigo;
    
    System.out.println("Esse algoritmo determina a distancia e a periculosidade de raio que caiu em uma regiao perto de uma pessoa. ");
    System.out.println("Digite o tempo discorrido entre a queda do raio e ter escutado o trovao.");
    t = Double.parseDouble(input.nextLine());
    d = 340*t;
    perigo = d<200;
    System.out.println("A distancia do da queda do raio: "+d);
    System.out.println("O raio apresentou algum perigo ao individuo: "+perigo);}
}
