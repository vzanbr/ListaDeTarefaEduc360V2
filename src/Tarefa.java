import java.util.ArrayList;

public class Tarefa {

    private String descricao;
    private ArrayList<Tarefa> tarefas;

    private ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void add(Tarefa tarefa) {
        if (!tarefas.contains(tarefa))
            tarefas.add(tarefa);
    }


    public void remover(Tarefa tarefa) {
        tarefas.remove(tarefa);

    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        return obj.equals(descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}