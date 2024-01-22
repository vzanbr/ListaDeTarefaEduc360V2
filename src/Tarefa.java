import java.util.ArrayList;
import java.util.Objects;

public class Tarefa {

    private String descricao;
    private ArrayList<Tarefa> tarefas;
    private String tarefa;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    private ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public Tarefa() {
        super();
    }

    public void adicionar(Tarefa tarefa) {
            if (!tarefas.contains(tarefa))
                 tarefas.add(tarefa);

    }

    public void remover(Tarefa tarefa) {
        tarefas.remove(tarefa);

    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa tarefa = (Tarefa) obj;
        return obj.equals(descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}