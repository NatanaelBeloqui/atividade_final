public class Organizador extends Pessoa {
    private String email;
    private Notifica notificacao;

    public Organizador(int id, String nome, String email, Notifica notificacao) {
        super(id, nome); // Inicializa os atributos herdados de Pessoa
        this.email = email;
        this.notificacao = notificacao;
    }

    // Construtor sem notificacao
    public Organizador(int id, String nome, String email) {
        super(id, nome);
        this.email = email;
        this.notificacao = null; // Define notificacao como null
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Notifica getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(Notifica notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Email: " + this.email + 
               ", Notificação: " + (notificacao != null ? notificacao.toString() : "Nenhuma");
    }
}
