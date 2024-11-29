public class Participante extends Pessoa {
    private String telefone;
    private Notifica notificacao;

    public Participante(int id, String nome, String telefone, Notifica notificacao) {
        super(id, nome); // Reutiliza o id e nome da classe Pessoa
        this.telefone = telefone;
        this.notificacao = notificacao;
    }

    // Construtor sem notificacao
    public Participante(int id, String nome, String telefone) {
        super(id, nome);
        this.telefone = telefone;
        this.notificacao = null; // Define notificacao como null
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Notifica getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(Notifica notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Telefone: " + this.telefone + ", Notificação: " + (notificacao != null ? notificacao.toString() : "Nenhuma");
    }
}
