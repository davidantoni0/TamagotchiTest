package ClassesPrincipais;
import java.util.Scanner;
public class CadastrarUsuario {
    public void cadastrar() {
    System.out.println("Cadastro de Usuário");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        
        Usuario novoUsuario = new Usuario(nomeUsuario, email, senha);

        System.out.println("Usuário criado com sucesso!");

        System.out.println("Digite um nome para o seu tamagotchi:");
        String nomeTamagotchi = scanner.nextLine();
        Tamagotchi tamagotchi = new Tamagotchi(nomeTamagotchi);
        novoUsuario.setTamagotchi(tamagotchi);
        Programa.usuarios.add(novoUsuario);


    }    
}
