package CadastroLogin;

import java.util.Scanner;

import ClassesPrincipais.Tamagotchi;
import ClassesPrincipais.Usuario;
import Menus.Programa;

public class CadastrarUsuario {
    public void cadastrar() {
        System.out.println("=== Cadastro de Usuário ===");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        String email;
        while (true) {
            System.out.print("Email: ");
            email = scanner.nextLine();

            boolean emailExistente = false;


            for (Usuario usuario : Programa.usuarios) {
                if (usuario.getEmail().equalsIgnoreCase(email)) {
                    System.out.println("Endereço de email já cadastrado!");
                    emailExistente = true;
                    break;
                }
            }

            if (!emailExistente) break;
        }

        System.out.print("Senha: ");
        String senha = scanner.nextLine();


        Usuario novoUsuario = new Usuario(nomeUsuario, email, senha);

        System.out.println("\nUsuário criado com sucesso!");
        System.out.print("Digite um nome para o seu Tamagotchi: ");
        String nomeTamagotchi = scanner.nextLine();

        Tamagotchi tamagotchi = new Tamagotchi(nomeTamagotchi);
        novoUsuario.setTamagotchi(tamagotchi);


        Programa.usuarios.add(novoUsuario);

        System.out.println("🎉 Tamagotchi criado com sucesso! Bem-vindo, " + nomeUsuario + "!");
    }
}

