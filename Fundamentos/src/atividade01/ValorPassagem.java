package Atividade01;

import java.util.Scanner;

public class ValorPassagem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em km que deseja percorrer: ");
        double distancia = scanner.nextDouble();

        double precoPorKm;
        if (distancia <= 200) {
            precoPorKm = 0.50;
        } else {
            precoPorKm = 0.45;
        }

        double precoPassagem = distancia * precoPorKm;

        System.out.println("O preço da passagem é: R$ " + precoPassagem);

        scanner.close();
    }
}
