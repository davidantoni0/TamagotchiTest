package ClassesMenuTamagotchi;
import ClassesPrincipais.Tamagotchi;
import java.util.Scanner;
public class AlimentarTamagotchi {
    public void alimentar(Tamagotchi tamagotchi){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alimentos disponíveis");
        int opcao = 0;

        while(opcao !=5){
            System.out.println("Bolinho de arroz(+10)");
            System.out.println("Batata frita(+15)");
            System.out.println("X-burger(+20)");
            System.out.println("Fatia de Pizza(+25)");
            System.out.println("sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Digite uma opção da lista.");
                continue;
            }
            
            int valorAlimento = 0;
            switch (opcao) {
                case 1:
                    valorAlimento =10;
                    break;
                case 2:
                    valorAlimento = 15;
                    break;
                case 3:
                    valorAlimento = 20;
                    break;
                case 4:
                    valorAlimento = 25;
                    break;
                case 5:
                    System.out.println("Voltando ao menu.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
