/* 1 - Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.
Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.
*/
package psc.exercicio03;
import java.util.*;

public class Questao01 {
    public static void main (String[] args){
        
        double numero1, numero2, resto;
       
       Scanner ler = new Scanner (System.in);
       
       System.out.print("Informe o primeiro número: ");
            numero1 = ler.nextDouble();
       
       System.out.print("Informe o segundo número: ");
            numero2 = ler.nextDouble();   
                
                while(numero2 == 0){
        
        System.out.print("\nInforme um número diferente de zero: ");
            numero2 = ler.nextDouble(); 
            
    }
            
       resto = numero1 % numero2;
       
       System.out.println("\nO resto da divisão será: " +resto);
       
       
        
    }
    
}
