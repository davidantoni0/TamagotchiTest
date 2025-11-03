package ClassesMenuTamagotchi;
import ClassesPrincipais.Tamagotchi;
public class StatusTamagotchi {

    public void status(Tamagotchi tamagotchi){
    System.out.println("Nome: " + tamagotchi.getNome());
    System.out.println("Fome: " + tamagotchi.getNivelFome());
    System.out.println("Felicidade: " + tamagotchi.getNivelFelicidade());
    System.out.println();
    
    }

}
