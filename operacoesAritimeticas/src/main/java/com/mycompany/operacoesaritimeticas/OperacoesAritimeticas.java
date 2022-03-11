/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operacoesaritimeticas;
//importaç~ao da biblioteca do scanner para aceitar entrada de dados
import java.util.Scanner;
/**
 *
 * @author thaynan
 */
public class OperacoesAritimeticas {
    public static void main(String[] args) {
        
        //criaç~ao do objeto para recebmento dos valores digitados
       Scanner entrada = new Scanner(System.in);
       
       //criaç~ao de variaveis para receber os valores
       int n1;// primeiro valor a ser digitado
       int n2;//segundo valor a ser digitado
       int soma;//variavel que recebera a soma dos dois valores
       
       //pedido de entrada de dados no prompt (prmeiro valor)
        System.out.println("Digite o primeiro valor ");
        
        //adiciona primeiro valor dentro da variavel
        n1 = entrada.nextInt();
        
       //pedido de entrada de dados no prompt (segundo valor)
        System.out.println("Digite o segundo valor: ");
        
        //adiciona o segundo valor dentro da variavel
        n2 = entrada.nextInt();
        
        //aqui 'e realizado a soma dos dois valores digitados
        soma = n1 + n2;
        
        System.out.println("Resultado " + n1 + " + " + n2 + " = " + soma);
        
       
    }
}
