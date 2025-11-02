import java.util.Scanner;
public class CadastrarUsuario {
    public void cadastrar() {
    System.out.println("Cadastro de Usuário");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome de usuário: ");
        String userName = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();
        Program.usuarios.add(new Usuario(userName, email, password));
        System.out.println("Usuário criado com sucesso!");

    }    
}
