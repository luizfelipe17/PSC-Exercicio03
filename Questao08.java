/*8 - Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. 
Seu programa deve receber o valor dos três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno. 
Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos outros dois!*/
package com.mycompany.psc.exercicio03;
import java.util.*;

public class Questao08 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double ladoA, ladoB, ladoC, maiorLado, menorLado, segundoMenorLado;
        
        System.out.print("Infome o valor dos lados do triangulo:"
                + "\n Lado A: ");
            ladoA = ler.nextDouble();
        System.out.print(" Lado B: "); 
            ladoB = ler.nextDouble();
        System.out.print(" Lado C: "); 
            ladoC = ler.nextDouble();    
            
        maiorLado = Math.max(Math.max(ladoA, ladoB), ladoC);
        menorLado = Math.min(Math.min(ladoA, ladoB), ladoC);
        segundoMenorLado = (ladoA + ladoB + ladoC) - maiorLado - menorLado;
        
            
            if (maiorLado < segundoMenorLado + menorLado){
                
                if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
                    
                    System.out.print("\nTriângulo equilátero");
                    
                }else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA){
                    
                    System.out.print("\nTriângulo isósceles");
                    
                }else if(ladoA != ladoB || ladoB != ladoC || ladoA != ladoC){
                    
                    System.out.print("\nTriângulo escaleno");
                    
                }
                
            } else {
                
                System.out.print("\nValores inválidos para um tringulo");
                
                return;
                
            }
            
    }
}
