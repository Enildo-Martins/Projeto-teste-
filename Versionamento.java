// - versao 2.0

import java.util.Scanner;

public class Versionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ola primeira versão");
        String nome;
        System.out.println("Digite seu nome:" );
        nome = sc.nextLine();

        System.out.printf("Olá %s",nome);
    }
}
