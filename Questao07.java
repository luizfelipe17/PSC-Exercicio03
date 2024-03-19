/* 7 - Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. 
Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:

- Se quantidade <= 5, o desconto será de 2%
- Se quantidade > 5 e quantidade <=10, o desconto será de 3%
- Se quantidade > 10 e quantidade <30, o desconto será de 5%
- Se quantidade >= 30 o desconto será de 10%
 */
package psc.exercicio03;
import java.util.*;

public class Questao07 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        String nome;
        double precoUnitario, desconto, valorTotal, preco;
        int qtsAdquirida;
        
        System.out.print("Informe o nome do produto: ");
            nome = ler.nextLine();
            
        System.out.print("Digite o preço unitário: ");
            precoUnitario = ler.nextDouble();
            
        System.out.print("Digite a quantidade adquirida: ");
            qtsAdquirida = ler.nextInt();
            
            preco = qtsAdquirida * precoUnitario;
            
            if (qtsAdquirida <= 5){
                
                desconto = 0.02;
                
            }else if (qtsAdquirida > 5 && qtsAdquirida <= 10){
                
                desconto = 0.03;
                
            }else if (qtsAdquirida > 10 && qtsAdquirida < 30){
                
                desconto = 0.05;
                
            }else if (qtsAdquirida >= 30){
                
                desconto = 0.10;
                
            }
            
            valorTotal = preco - (preco * desconto);
            
            System.out.print("O valor sem o desconto será: "+preco+"\n"
                    + "O desconto será de: "+(desconto*100)+"\n"
            + "O total a pagar será: "+valorTotal);
        
    }
}
