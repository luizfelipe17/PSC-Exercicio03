/*(Decom/UFOP) Na lojinha do Sr. Aboo, encontramos produtos de informática com preços especiais. 
Mas o Sr. Aboo segue uma receita de seus antepassados para acrescentar uma porcentagem sobre o valor de custo do produto, garantindo assim, a estabilidade financeira das futuras gerações de sua família. 
A tabela abaixo, feita pelo avô do Sr. Aboo, descreve o valor do lucro de um produto, considerando o valor de compra do mesmo.

Para auxiliar o Sr. Aboo, codifique um programa que leia o valor da compra de um produto de informática e imprima a porcentagem do lucro e o valor da venda.  
O programa deve exibir a mensagem "Lojinha do Sr. Aboo" e em seguida solicitar o valor da compra com o fornecedor, e, em seguida, exibir qual será a porcentagem de lucro e o valor que o item deve ser colocado para venda.
 */
package com.mycompany.pscexercicio03;
import java.util.*;

        
public class Questao10 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        String produto;
        double valorCompra, porcentagemLucro, valorVenda;
        
        System.out.print("Lojinha do Sr. Aboo \n\n");
        
        System.out.print("Qual nome do produto: ");
            produto = ler.nextLine();
        
        System.out.print("Digite o valor da compra: R$");
            valorCompra = ler.nextDouble();
        
            
            if (valorCompra < 10){
                
                porcentagemLucro = 0.7;
                        
                valorVenda = valorCompra + (valorCompra * porcentagemLucro);        
                
                System.out.print("\nA porcentagem de lucro sobre o produto "+produto+" será de 70%\n");
                System.out.printf("O Valor de venda será: R$%.2f", valorVenda);
                
            }else if (valorCompra >= 10 && valorCompra < 30){
                
                porcentagemLucro = 0.5;
                        
                valorVenda = valorCompra + (valorCompra * porcentagemLucro);        
                
                System.out.print("\nA porcentagem de lucro sobre o produto "+produto+" será de 50%\n");
                System.out.printf("O Valor de venda será: R$%.2f", valorVenda);
                
            } else if (valorCompra >= 30 && valorCompra < 50){
                
                porcentagemLucro = 0.4;
                        
                valorVenda = valorCompra + (valorCompra * porcentagemLucro);        
                
                System.out.print("\nA porcentagem de lucro sobre o produto "+produto+" será de 40%\n");
                System.out.printf("O Valor de venda será: R$%.2f", valorVenda);
                
            } else if (valorCompra >= 50){
                
                porcentagemLucro = 0.3;
                        
                valorVenda = valorCompra + (valorCompra * porcentagemLucro);        
                
                System.out.print("\nA porcentagem de lucro sobre o produto "+produto+" será de 30%\n");
                System.out.printf("O Valor de venda será: R$%.2f", valorVenda);
                
            }
    } 
}
