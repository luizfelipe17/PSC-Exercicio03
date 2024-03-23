/*11 - Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair. 
Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura de seleção Switch/Case para implementar seu produto. 
Utilize números inteiros para indicar cada opção.
*/
package com.mycompany.psc.exercicio03;
import java.util.*;

public class Questao11 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int opcao;
        boolean sair = false;
        
        while (true) {
            
                System.out.print("ESCOLHA UMA OPÇÃO\n\n"
                + " 1 - EXIBIR SALDO\n"
                + " 2 - EXIBIR EXTRATO\n"
                + " 3 - REALIZAR DEPÓSITO\n"
                + " 4 - REALIZAR SAQUE\n\n"
                + " 0 - SAIR\n\n"
                + "DIGITE: ");
                opcao = ler.nextInt();   
        
        switch (opcao){
            
            case 1: 
            
                System.out.printf("\n SALDO \n R$: ");
                    
                break;
            
            case 2: 
            
                System.out.println("\n SEGUE O SEU EXTRATO\n");
                    
                break;
            
            case 3: 
            
                System.out.println("\n DEPÓSITO");
                System.out.println(" INFORME O VALOR R$:");
                
                break;
                
            case 4: 
            
                System.out.println("\n SAQUE");
                System.out.print(" ESCOLHA O VALOR\n\n "
                        + "1 - R$200 / 2 - R$100 / 3 - R$50 / 4 - OUTRO VALOR");
                    
                break;
                
            case 0: 
            
                System.out.println("OBRIGADO!!!");
                    
                return; 
                
            default:
                
               System.out.print("OPÇÃO INVÁLIDA");
               
               return;

        } 
        
         System.out.println("\n\n9 - VOLTAR\n0 - SAIR");
            opcao = ler.nextInt();
            if (opcao == 9) {

                
            }else if(opcao == 0){
                
                System.out.println("OBRIGADO!!!");
                
                return;
                
            }else {
                
                System.out.print("OPÇÃO INVÁLIDA");
               
                return;
                
            }
        
        }
    } 
}
