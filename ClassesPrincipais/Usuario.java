package ClassesPrincipais;
public class Usuario {
    private String nomeUsuario;
    private String email;
    private String senha;
    private Tamagotchi tamagotchi;

    public Usuario(String nomeUsuario, String email, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.tamagotchi = null;
    }


    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Tamagotchi getTamagotchi(){
        return tamagotchi;
    }

    public void setTamagotchi(Tamagotchi tamagotchi){
        this.tamagotchi = tamagotchi;
    }
}