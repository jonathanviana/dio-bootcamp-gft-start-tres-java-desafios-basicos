package desafios.c;

import java.util.Scanner;

public class DesafioC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id, quantity;
        float price, amount;

        System.out.print("Favor, digite o número do item que você deseja: ");
        id = sc.nextInt();

        System.out.print("Favor, digite a quantidade desejada: ");
        quantity = sc.nextInt();

        switch (id) {
            case 1:
                amount = (price = (float) (4.00 * quantity));
                System.out.printf("Item: Cachorro Quente" + " Quantidade: " + quantity + " Total: R$ %.2f\n", amount);
                break;
            case 2:
                amount = (price = (float) (4.50 * quantity));
                System.out.printf("Item: X - Salada" + " Quantidade: " + quantity + " Total: R$ %.2f\n", amount);
                break;
            case 3:
                amount = (price = (float) (5.00 * quantity));
                System.out.printf("Item: X - Bacon" + " Quantidade: " + quantity + " Total: R$ %.2f\n", amount);
                break;
            case 4:
                amount = (price = (float) (2.00 * quantity));
                System.out.printf("Item: Torrada Simples" + " Quantidade: " + quantity + " Total: R$ %.2f\n", amount);
                break;
            case 5:
                amount = (price = (float) (1.50 * quantity));
                System.out.printf("Item: Refrigerante" + " Quantidade: " + quantity + " Total: R$ %.2f\n", amount);
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}

