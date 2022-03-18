/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcsalario;
import java.util.Scanner;
/**
 *
 * @author Thaynan
 */
public class ClacSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        double vendas, salario, salarioFinal;
        
        System.out.println("Digite o nome do vendedor: ");
        nome = entrada.nextLine();
        
        System.out.println("Digite o salario fixo do vendedor: R$");
        salario = entrada.nextDouble();
        
        System.out.println("Digite o valor em R$ das vendas efetuadas: ");
        vendas = entrada.nextDouble();
        
        salarioFinal = salario + (vendas * 0.15);
        
        System.out.println("O " + nome + " tem o salariofixo de R$" + salario + " e o salario R$" + salarioFinal + " com 15% sobre R$" + vendas + " em vendas");
        
    }
    
}
