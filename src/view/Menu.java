package view;

import controller.Catalogo;
import domain.Veiculos;

import java.util.Scanner;

public class Menu {

    public static void menuCadastro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca do veiculo ");
        String marca = sc.next();
        System.out.println("Digite o modelo do veiculo");
        String modeloVeiculo = sc.next();
        System.out.println("Digite a cor do veiculo");
        String cor = sc.next();
        System.out.println("Digite a placa do veiculo");
        String placa = sc.next();
        System.out.println("Digite o valor da Diaria");
        int valorDaDiaria = sc.nextInt();
        Catalogo.CadastraVeiculo(new Veiculos(marca, modeloVeiculo, cor, placa, valorDaDiaria));
    }

    public static void exibirMenu() {
        System.out.println("========== LOCADORA ===========");
        System.out.println(" 1 - CADASTRAR");
        System.out.println(" 2 - LISTAR");
        System.out.println(" 3 - ORDENAR MENOR VALOR");
        System.out.println(" 4 - DELETAR VEICULO");
        System.out.println(" 5 - SAIR");

    }

}
