package Atividade01;

import java.util.Scanner;

public class CalculoEnergiaEletrica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de KW/h consumido: ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o tipo de instalação (R para residência, I para indústria, C para comércio): ");
        char tipoInstalacao = scanner.next().charAt(0);

        double precoKWh;

        if (tipoInstalacao == 'R' || tipoInstalacao == 'r') {
            if (consumo <= 500) {
                precoKWh = 0.40;
            } else {
                precoKWh = 0.65;
            }
        } else if (tipoInstalacao == 'C' || tipoInstalacao == 'c') {
            if (consumo <= 1000) {
                precoKWh = 0.55;
            } else {
                precoKWh = 0.60;
            }
        } else if (tipoInstalacao == 'I' || tipoInstalacao == 'i') {
            if (consumo <= 5000) {
                precoKWh = 0.55;
            } else {
                precoKWh = 0.60;
            }
        } else {
            System.out.println("Tipo de instalação inválido. Use R, C ou I.");
            scanner.close();
            return;
        }

        double valorPagar = consumo * precoKWh;
        System.out.println("O valor a pagar é: R$ " + valorPagar);

        scanner.close();
    }

}
