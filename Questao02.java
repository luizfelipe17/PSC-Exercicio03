/* 2 - Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno. 
Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que 7 o aluno é aprovado). 
Escrever também a média calculada.
 */
package psc.exercicio03;
import java.util.*;

public class Questao02 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double nota1, nota2, nota3, media;
        
        System.out.print("Olá\n"
                + "Informe o valor da 1ª avaliação: ");
                nota1 = ler.nextDouble();
        
        System.out.print("Informe o valor da 2ª avaliação: ");
                nota2 = ler.nextDouble();
                
        System.out.print("Informe o valor da 3ª avaliação: ");
                nota3 = ler.nextDouble();
                
                
            media = (nota1 + nota2 + nota3) / 3;
            
            System.out.printf("\nA média foi de: %.0f",media);
            
            if (media < 7){
                
                System.out.print("\n\n'REPROVADO' :(");
                
            } else
                if (media >= 7){
        
                System.out.print("\n\n'APROVADO' PARABéNS ;)");
            
            }
    }
}
