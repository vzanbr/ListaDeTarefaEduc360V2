import java.util.Comparator;

public class Tarefa  {

    private static int moreId = 0;

    private int id;
    private String nomeTarefa;

    public Tarefa() {
        this.id = moreId++;
    }

    public Tarefa (int id, String nomeTarefa) {
        this.id = id;
        this.nomeTarefa = nomeTarefa;
    }

    public int getId() {
        return id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

//    public static void addTarefa(ArrayList<String> listaTarefas) {
//
//        Scanner leitor = new Scanner(System.in);
//        System.out.println("=====Tarefa Nova=====");
//        System.out.print("Digite a descrição: ");
//        String tarefaResposta = leitor.nextLine();
//        {
//            if (!listaTarefas.contains(tarefaResposta)) {
//                listaTarefas.add(tarefaResposta);
//                System.out.println("Tarefa " + tarefaResposta + " adicionada com sucesso!");
//            } else {
//                System.out.println("Ja existe tarefa com o mesmo nome!");
//            }
//
//        }
//    }


    @Override
    public String toString() {
        return "Tarefas {" +  " id=" + id +  ", nomeTarefa='" + nomeTarefa + '\'' + '}';
    }

    public static final Comparator<Tarefa> COMPARATOR_BY_NOME = Comparator.comparing(Tarefa::getNomeTarefa);
    public static final Comparator<Tarefa> COMPARATOR_BY_ID = Comparator.comparing(Tarefa::getId);
}