//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        Pessoa pessoa1 = new Pessoa(nome, idade, email);
        pessoa1.status();

    }

}