import java.util.Scanner;
public class LoginUsuario {
    
    public boolean login() {
    System.out.println("Login de Usuário");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        AutenticarUsuario autenticar = new AutenticarUsuario();
        boolean sucesso = autenticar.autenticar(email, senha);
        if (!sucesso) {
            System.out.println("Falha no login. Credenciais inválidas.");
            return false;
        }
        System.out.println("Login realizado com sucesso!");
        return true;
    }
}