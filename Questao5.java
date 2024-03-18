/* 5 - Escreva um programa em Java para determinar se o indivíduo está com um peso favorável. 
Essa situação é determinada através do IMC (Índice de Massa Corpórea), 
que é definida pela equação: IMC = pesoaltura2. A situação do peso é determinada pela tabela abaixo: 
 */
package psc.exercicio03;
import java.util.*;

public class Questao5 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double peso, altura, imc;
        
        System.out.print("IMC abaixo de 20 - Abaixo do peso\n"
                + "IMC de 20 a 25 - Peso Normal\n"
                + "IMC de 25 a 30 - Sobrepeso\n"
                + "IMC de 30 a 40 - Obeso\n"
                + "IMC de 40 e acima - Obeso Mórbido\n");
        
        System.out.print("\n\nInforme o seu peso: ");
            peso = ler.nextDouble();
        
        System.out.print("Informe a sua altura (metros): ");
            altura = ler.nextDouble();
        
            imc = peso / (Math.pow(altura ,2));

            
            if (imc < 20){
                
                System.out.print("\nABAIXO DO PESO");
                
            }else if (imc >= 20 && imc < 25){
                
                System.out.print("\nPESO NORMAL");
                
            }else if (imc >= 25 && imc < 30){
                
                System.out.print("\nSOBREPESO");
                
            }else if (imc >= 30 && imc <40){
                
                System.out.print("\nOBESO");
                
            }else if (imc >= 40){
                
                System.out.print("\nOBESO MÓRBIDO");
                
            }
            
          
    }
}
