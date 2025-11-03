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
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public int getNivelFome() {
        return nivelFome;
    }
    public int getNivelFelicidade() {
        return nivelFelicidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNivelFome(int nivelFome) {
        this.nivelFome = nivelFome;
        
    }
    public void setNivelFelicidade(int nivelFelicidade) {
        this.nivelFelicidade = nivelFelicidade;
    }

}
