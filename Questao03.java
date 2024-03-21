/*Escreva um programa em Java para ler o número de votos brancos, nulos e válidos. 
Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.*/
package com.mycompany.psc.exercicio03;
import java.util.*;

public class Questao03 {
    public static void main (String [] args){
        
        Scanner ler = new Scanner (System.in);
        
        int votosBrancos, nulos, valido;
        double totalVotos, porcentagemVotosBranco, porcentagemNulos, porcentagemValido;
        
        System.out.print("ELEIÇÕES\nDigite a quantidade de votos brancos: ");
            votosBrancos = ler.nextInt();
            
        System.out.print("Digite a quantidade de votos nulos: ");
            nulos = ler.nextInt();
            
        System.out.print("Digite a quantidade de votos válidos: ");
            valido = ler.nextInt();
            
            totalVotos = votosBrancos + valido + nulos;
            
            porcentagemVotosBranco = (votosBrancos / totalVotos) * 100;
            porcentagemValido = (valido / totalVotos) * 100;
            porcentagemNulos = (nulos / totalVotos) * 100;
        
        System.out.printf(" \nRESULTADOS\n\n - Votos Brancos: %.2f",porcentagemVotosBranco);
        System.out.print("%\n");
        System.out.printf(" - Votos Nulos: %.2f",porcentagemNulos);
        System.out.print("%\n");
        System.out.printf(" - Votos Válidos: %.2f",porcentagemValido);
        System.out.print("%\n");

    }
}
