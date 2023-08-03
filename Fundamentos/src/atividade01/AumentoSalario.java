package Atividade01;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double percentualAumento;
        if (salario > 1350.00) {
            percentualAumento = 0.10;
        } else {
            percentualAumento = 0.15;
        }

        double aumento = salario * percentualAumento;
        double novoSalario = salario + aumento;

        System.out.println("O valor do aumento é: R$ " + aumento);
        System.out.println("O novo salário é: R$ " + novoSalario);

        scanner.close();
    }

    }

