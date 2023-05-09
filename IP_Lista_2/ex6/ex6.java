
package ip_lista_2;

import java.util.Scanner;

/**
 * Crie uma nova o programa da questão 5, para que ele considere a frequência do aluno. 
 * Agora, para ser aprovado o aluno precisa ter nota igual ou superior a sete no trabalho, nota igual ou superior a seis em pelo menos uma das provas e frequência igual ou superior a 75%. 
 * Além desta diferença, caso o aluno tenha nota seis no trabalho ele poderá ser aprovado, mas para isto precisa ter frequência igual ou superior a 90%.
 */
public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p1, p2, t, f;
        boolean x, y, z, w, f1, x1;
    
        System.out.println("Esse algoritmo se um aluno doi aprovado. ");
        System.out.println("Digite a nota da prova 1");
        p1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite a nota da prova 2");
        p2 = Integer.parseInt(input.nextLine());
        System.out.println("Digite a nota do trabalho");
        t = Integer.parseInt(input.nextLine());
        System.out.println("Digite a porcentagem de frequencia do aluno.");
        f = Integer.parseInt(input.nextLine());
        w = f >= 75;
        x = t>=7;
        x1 = t==6;
        f1 = f>=90;
        y = (p1>=6)||(p2>=6);
        z = x&&y&&w
   	||y&&f1&&x1;    
        System.out.println("O aluno f_oi aprovado: "+z);}
    } 
    

