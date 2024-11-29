public class Notifica {
    private int id;
    private String texto;

    public Notifica(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void enviar() {
        System.out.println("Enviando notificação: " + texto);
    }

    @Override
    public String toString() {
        return "Notificação [ID: " + id + ", Texto: " + texto + "]";
    }
}
