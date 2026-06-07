package Loja;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pratos p = new Pratos();
        Mesas m = new Mesas();
        //switch case para as mesas e os pratos, escolhendo entre as opções de pratos e a quantidade
        // de cadeiras, por exemplo

        System.out.println("digite a opção que você deseja");
        System.out.println("1 - para fazer o cadastro" +
                "2 - para ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                p.cadastrar();
                break;
            case 2:
                p.alterar();
                break;
        }
    }
}