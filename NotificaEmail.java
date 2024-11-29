public class NotificaEmail extends Notifica {
    private String emailDestino;

    public NotificaEmail(int id, String texto, String emailDestino) {
        super(id, texto);
        this.emailDestino = emailDestino;
    }

    public String getEmailDestino() {
        return emailDestino;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando email para: " + emailDestino + " com texto: " + getTexto());
    }

    @Override
    public String toString() {
        return super.toString() + ", Email destino: " + emailDestino;
    }
}
