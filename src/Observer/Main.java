package Observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o exemplo: 1-Observer 2-Strategy 3-Command");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:

                SistemaNoticias canal = new SistemaNoticias();

                SistemaNoticias.adicionar(new Usuario("Paulinho"));
                SistemaNoticias.adicionar(new Usuario("Brenda"));
                SistemaNoticias.notificar("Nova atualização disponível!");
                break;
        }
    }
}