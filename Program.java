import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Program {
    public static Queue<User> users = new ArrayDeque<>();
    public static void main(String[] args) {

        //usuario teste
        users.add(new User("teste", "qwerty@gmail.com", "123456"));

        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo.");

        while(opcao != 3){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Login");
        System.out.println("2 - Registrar");
        System.out.println("3 - Sair");

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
                if(login.login()){
                    
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
