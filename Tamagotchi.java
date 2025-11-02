public class Tamagotchi {
    private String nome;
    private int idade;
    private int nivelFome;
    private int nivelFelicidade;

    public Tamagotchi(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.nivelFome = 50; // Initial hunger level
        this.nivelFelicidade = 50; // Initial happiness level
    }
    public String getName() {
        return nome;
    }
    public int getAge() {
        return idade;
    }
    public int getHungerLevel() {
        return nivelFome;
    }
    public int getHappinessLevel() {
        return nivelFelicidade;
    }
    public void setName(String nome) {
        this.nome = nome;
    }
    public void setHungerLevel(int nivelFome) {
        this.nivelFome = nivelFome;
        
    }
    public void setHappinessLevel(int nivelFelicidade) {
        this.nivelFelicidade = nivelFelicidade;
    }

}
