// versao 3.0

import java.time.LocalTime;
import java.util.Scanner;

public class Versionamento {

    public static String saudacao() {
        int hora = LocalTime.now().getHour();

        if (hora < 12) {
            return "Bom dia";
        } else if (hora < 18) {
            return "Boa tarde";
        } else {
            return "Boa noite";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println(saudacao() + ", " + nome + "!");

        scanner.close();
    }
}
