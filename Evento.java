import java.time.LocalDateTime;
import java.util.ArrayList;

public class Evento {
    private int id;
    private Organizador organizador;
    private Local local;
    private LocalDateTime data;
    private String descricao;
    private ArrayList<Participante> participantes;
    private int vagas;

    public Evento(
        int id, 
        Organizador organizador, 
        Local local, 
        LocalDateTime data, 
        String descricao, 
        int vagas
        ) {
        this.id = id;
        this.organizador = organizador;
        this.local = local;
        this.data = data;
        this.descricao = descricao;
        this.vagas = vagas;
        this.participantes = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void adicionarParticipante(Participante participante) {
        if (participantes.size() < vagas) {
            this.participantes.add(participante);
        } else {
            System.out.println("Não há mais vagas disponíveis.");
        }
    }

    public void removerParticipante(Participante participante) {
        this.participantes.remove(participante);
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
}
