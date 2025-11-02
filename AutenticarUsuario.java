public class AutenticarUsuario {

    public boolean autenticar(String email, String password) {
        for (Usuario usuario : Program.usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false; 
    }
    
}
