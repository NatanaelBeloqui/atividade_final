public class NotificaTelefone extends Notifica {
    private String telefoneDestino;

    public NotificaTelefone(int id, String texto, String telefoneDestino) {
        super(id, texto);
        this.telefoneDestino = telefoneDestino;
    }

    public String getTelefoneDestino() {
        return telefoneDestino;
    }

    public void setTelefoneDestino(String telefoneDestino) {
        this.telefoneDestino = telefoneDestino;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: " + telefoneDestino + " com texto: " + getTexto());
    }

    @Override
    public String toString() {
        return super.toString() + ", Telefone destino: " + telefoneDestino;
    }
}
