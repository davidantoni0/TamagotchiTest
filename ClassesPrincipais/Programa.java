package ClassesPrincipais;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Programa {
    public static Queue<Usuario> usuarios = new ArrayDeque<>();
    public static void main(String[] args) {

        //usuario teste
         Usuario usuarioTeste = new Usuario("Zé da Manga", "qwe", "qwe");
        usuarioTeste.setTamagotchi(new Tamagotchi("TamagotchiTest"));
        usuarios.add(usuarioTeste);



        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo.");

        while(opcao != 3){
        
        System.out.println("1 - Login");
        System.out.println("2 - Registrar");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");

        try {
            opcao = scanner.nextInt();
            
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            scanner.next();
            continue;
        }



        switch(opcao){
            case 1:
                System.out.println("Login selecionado.");
                LoginUsuario login = new LoginUsuario();
                Usuario usuarioLogado = login.login();
                if(usuarioLogado != null){
                    MenuTamagotchi menu = new MenuTamagotchi();
                        menu.mostrarMenu(usuarioLogado);
                };
                break;
            case 2:
                CadastrarUsuario cadastro = new CadastrarUsuario();
                cadastro.cadastrar();
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        }
    scanner.close();
    }
}
