/*(Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela:
Idade (anos) - Classificação
menor que 16 - Não é eleitor
de 16 a 17 - Eleitor facultativo
de 18 a 65 - Eleitor obrigatório
acima de 65 - Eleitor facultativo
Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO*/

package com.mycompany.pscexercicio03;
import java.util.*;

public class Questao09 {
    public static void main (String[] args){
    
        Scanner ler = new Scanner (System.in);
        
        int idade;
        
        System.out.print("Digite a sua idade: ");
            idade = ler.nextInt();
            
        if ( idade < 0){
            
            System.out.print("IDADE NÂO È VÁLIDA");
                
            } else if ( idade < 16 ){
            
            System.out.print("SUA IDADE É: "+idade+" ANOS");
            System.out.print(" - NÃO É ELEITOR");
            
            } else if ( idade >= 16 && idade <= 17){
             
            System.out.print("SUA IDADE É: "+idade+" ANOS");
            System.out.print(" - ELEITOR FACULTATIVO");
                
            } else if ( idade >= 18 && idade <= 65){
             
            System.out.print("SUA IDADE É: "+idade+" ANOS");
            System.out.print(" - ELEITOR OBRIGATÓRIO");    
                
            } else if ( idade > 65){
             
            System.out.print("SUA IDADE É: "+idade+" ANOS");
            System.out.print(" - ELEITOR FACULTATIVO");    
                
            }       
        }    
    }
