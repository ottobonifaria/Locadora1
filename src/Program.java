import controller.Catalogo;
import domain.Veiculos;

import java.util.*;

import static view.Menu.exibirMenu;
import static view.Menu.menuCadastro;

public class Program {

    public static void main(String[] args) {

        //List veiculos = new ArrayList<Veiculos>();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            exibirMenu();
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("=====> CADASTRAR VEICULO <=====");
                    menuCadastro();
                    break;
                case 2:
                    System.out.println("\n===== FIFTCARS ===== \n Confira nossos modelos\n");
                    System.out.println("=====> LISTA DE VEICULO <=====");
                    Catalogo.listar();
                    break;
                case 3:
                    Catalogo.ordena();
                    Catalogo.listar();
                    break;
                case 4:
                    Catalogo.deletaVeiculo();
                    Catalogo.listar();
                   break;
                case 5:
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }while(menu !=5);

    }
}
