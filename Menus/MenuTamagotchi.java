package Menus;
import java.util.Scanner;
import ClassesMenuTamagotchi.AlimentarTamagotchi;
import ClassesMenuTamagotchi.BrincarTamagotchi;
import ClassesMenuTamagotchi.StatusTamagotchi;
import ClassesPrincipais.Tamagotchi;
import ClassesPrincipais.Usuario;

public class MenuTamagotchi {
    public void mostrarMenu(Usuario usuarioLogado) {
        Tamagotchi tamagotchi = usuarioLogado.getTamagotchi();
        if (tamagotchi == null) {
            System.out.println("Você ainda não tem um Tamagotchi!");
            return;
        }

        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, " + tamagotchi.getNome() + " quer saber o que fazer.");

        while (opcao != 4) {
            
            System.out.println("=== Menu Tamagotchi ===");
            System.out.println("1 - Alimentar Tamagotchi");
            System.out.println("2 - Brincar com Tamagotchi");
            System.out.println("3 - Ver status do Tamagotchi");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = scanner.nextInt();
                
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next();
                continue;
            }
            System.out.println();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu alimentar o Tamagotchi.");
                    AlimentarTamagotchi alimentarTamagotchi = new AlimentarTamagotchi();
                    alimentarTamagotchi.alimentar(tamagotchi);
                    break;
                case 2:
                    System.out.println("Você escolheu brincar com o Tamagotchi.");
                    BrincarTamagotchi brincarTamagotchi = new BrincarTamagotchi();
                    brincarTamagotchi.brincar(tamagotchi);
                    break;
                case 3:
                    System.out.println("Exibindo status do Tamagotchi.\n");
                    StatusTamagotchi statusTamagotchi = new StatusTamagotchi();
                    statusTamagotchi.status(tamagotchi);
                    break;
                case 4:
                    System.out.println("Saindo do menu Tamagotchi.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
