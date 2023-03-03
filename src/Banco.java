public class Banco {

    private String senha;
    private int usuario;


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha, int usuario) {
        if (usuario ==10) {
                this.senha = senha;
    }
}
