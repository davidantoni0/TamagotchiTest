package ClassesMenuTamagotchi;
import java.util.Scanner;
public class AlimentarTamagotchi {
    public void alimentar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alimentos disponíveis");
        int opcao = 0;

        while(opcao !=5){
            System.out.println("Bolinho de arroz(+10)");
            System.out.println("Bolinho de arroz(+10)");
            System.out.println("Bolinho de arroz(+10)");
            System.out.println("Bolinho de arroz(+10)");
            System.out.println("sair");
            System.out.println("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Digite uma opção da lista.");
                continue;
            }
            

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
