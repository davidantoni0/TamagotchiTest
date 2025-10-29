import java.util.Scanner;
public class MenuTamagotchi {
    public void exibirMenu() {
        int opcao = 0;

        while (opcao != 4) {
            
            System.out.println("=== Menu Tamagotchi ===");
            System.out.println("1. Alimentar Tamagotchi");
            System.out.println("2. Brincar com Tamagotchi");
            System.out.println("3. Ver status do Tamagotchi");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            
            try {
                opcao = scanner.nextInt();
                
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next();
                continue;
            }
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu alimentar o Tamagotchi.");
                    // Lógica para alimentar o Tamagotchi
                    break;
                case 2:
                    System.out.println("Você escolheu brincar com o Tamagotchi.");
                    // Lógica para brincar com o Tamagotchi
                    break;
                case 3:
                    System.out.println("Exibindo status do Tamagotchi.");
                    // Lógica para exibir status do Tamagotchi
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
