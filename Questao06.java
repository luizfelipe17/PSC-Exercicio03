/* Escreva um programa que peça ao usuário que insira um número de 1 a 4, correspondendo a cada estação do ano (1 para Primavera, 2 para Verão, 3 para Outono, e 4 para Inverno) 
para identificar a estação escolhida e imprimir uma mensagem característica daquela estação. */
package com.mycompany.psc.exercicio03;
import java.util.*;

public class Questao06 {
    public static void main (String [] args){
        
        Scanner ler = new Scanner (System.in);
        
        int selecao;
        
        System.out.print("Estações: \n\n"
                + " 1 - PRIMAVERA\n"
                + " 2 - VERÃO\n"
                + " 3 - OUTONO\n"
                + " 4 - INVERNO\n\n"
                + "Escolha uma das opções: ");
            selecao = ler.nextInt();
          
        if (selecao == 1){
            
            System.out.println("Na estação do renascimento, a natureza floresce e o sol brilha, inspirando renovação e esperança.");
            
        }if ( selecao == 2){
            
            System.out.println("Nos dias ensolarados e quentes, a energia vibrante da estação traz risos à beira-mar, mergulhos refrescantes e memórias radiantes sob o brilho do sol.");
            
        }if ( selecao == 3){
            
            System.out.println("Na estação das folhas douradas e do vento suave, a natureza se prepara para mudanças, evocando uma beleza melancólica e efêmera.");
            
        }if ( selecao == 4){
            
            System.out.println("Na estação de neve e ar fresco, a natureza se aquietando, em preparação para a renovação primaveril.");
            
        }
        
    }  
}
