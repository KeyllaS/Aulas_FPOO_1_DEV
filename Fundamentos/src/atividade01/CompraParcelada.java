package Atividade01;

import java.util.Scanner;

public class CompraParcelada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorProduto * quantidade;

        System.out.print("Digite a forma de pagamento (D para débito, C para crédito): ");
        char formaPagamento = scanner.next().charAt(0);

        if (formaPagamento == 'D' || formaPagamento == 'd') {
            double desconto = 0;
            if (valorTotal <= 100.00) {
                desconto = valorTotal * 0.05;
            } else {
                desconto = valorTotal * 0.03;
            }
            valorTotal -= desconto;
            System.out.println("Valor total com desconto: R$" + valorTotal);
        } else if (formaPagamento == 'C' || formaPagamento == 'c') {
            System.out.print("Digite o número de parcelas: ");
            int numParcelas = scanner.nextInt();

            double valorParcela = valorTotal / numParcelas;
            System.out.println("Valor da parcela: R$" + valorParcela);
        } else {
            System.out.println("Forma de pagamento inválida!");
        }

        System.out.println("Informações da compra:");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário: R$" + valorProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$" + (valorProduto * quantidade));
    }

}

