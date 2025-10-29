public class AutenticarUsuario {

    public boolean autenticar(String email, String password) {
        for (User user : Program.users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false; 
    }
    
}
