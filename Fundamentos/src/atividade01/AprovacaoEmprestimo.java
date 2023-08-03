package Atividade01;

import java.util.Scanner;

public class AprovacaoEmprestimo {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        System.out.print("Digite o valor da casa a comprar: ");
        double valorCasa = scanner.nextDouble();

        System.out.print("Digite o salário da pessoa: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos para pagar: ");
        int anosPagar = scanner.nextInt();

        // Cálculo do valor da prestação mensal
        int mesesPagar = anosPagar * 12;
        double prestacaoMensal = valorCasa / mesesPagar;

        // Verificação se a prestação é inferior a 30% do salário
        double limitePrestacao = salario * 0.3;

        if (prestacaoMensal <= limitePrestacao) {
            System.out.println("Empréstimo aprovado!");
            System.out.println("Valor da prestação mensal: R$ " + prestacaoMensal);
        } else {
            System.out.println("Empréstimo rejeitado! A prestação excede 30% do salário.");
        }

        scanner.close();
    }

}
