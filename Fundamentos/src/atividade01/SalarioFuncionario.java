package atividade01;

import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionários: ");
        double salario = scanner.nextDouble();
        
        double percentualAumento;
        if(salario > 1350.00) {
            percentualAumento = 0.10;
        }else{
            percentualAumento = 0.15;
        }
        
        double aumento = salario * percentualAumento;
        double novoSalario = salario + aumento;
        
        System.out.println("o valor do aumento é: R$ " + aumento);
        System.out.println("o novo salario é: R$ " + novoSalario);
    }
}
