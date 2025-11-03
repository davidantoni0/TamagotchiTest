package ClassesPrincipais;
import java.util.Scanner;
public class LoginUsuario {
    
    public Usuario login() {
    System.out.println("Login de Usuário");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        for (Usuario usuario : Programa.usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(senha)) {
                System.out.println("Login bem-sucedido!");
                return usuario;
            }
        }
        System.out.println("Login ou senha incorretos.");
        return null;
    }
}