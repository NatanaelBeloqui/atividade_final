public class Pessoa {
    public int id;
    public String nome;

    public Pessoa(
        int id,
        String nome
    ) {
        this.id = id;
        this.nome = nome;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId()
        + "Nome: " + this.getNome();
    }
}
