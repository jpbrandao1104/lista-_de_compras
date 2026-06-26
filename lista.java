import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> listaCompras = new ArrayList<>();
        int opcaoLista = 0;
        int opcao = 0;
        do{
            try{
            System.out.println("""
            Escolha uma opcao

            1-Criar uma nova lista de compras
            2-Sair

                """);
              opcaoLista = leia.nextInt();
                leia.nextLine();

                switch (opcaoLista) {
                    case 1 -> {System.out.println("Lista criada");

                    do{
                        System.out.println("""
                                EScolha a opcao desejada:
                                1-Adicionar um item a lista \n
                                """;);

                    }while(opcao != 5);
                }
                    case 2 -> System.out.println("Obrigado por usar o nosso sistema");
                    default -> System.out.println("opcao invalida");
                }
        }catch(Exception erro){
            System.out.println("Erro!!! entrada invalida");
            leia.nextLine();
            opcaoLista = 1;
        }
            }while(opcaoLista != 2);
    }
}