
public class TarefaException extends Exception{

    public TarefaException(String mesnagem){
        super(mesnagem);
    }
}

//                case "2":
//                        Tarefa tarefas = new Tarefa();
//                        System.out.println("=====Tarefa Nova=====");
//                        System.out.print("Digite a descrição: ");
//                        String tarefaResposta = leitor.nextLine();
//
//                        if (tarefaResposta.isEmpty()) {
//                        System.out.println("A descrição da tarefa não pode ser vazia.");
//                        return;
//                        }
//                        tarefas.setNomeTarefa(tarefaResposta);
//                        try {
//                        if (!listaTarefas.contains(tarefas)) {
//                        listaTarefas.add(tarefas);
//                        System.out.println("Tarefa " + tarefaResposta + " adicionada com sucesso!");
//                        } else {
//                        throw new TarefaException("Já existe uma tarefa com o mesmo nome!" + tarefaResposta);
//                        }
//                        } catch(TarefaException e){
//                        System.out.println(e.getMessage());
//                        }
//
//                        for (Tarefa tarefa : listaTarefas)
//                        System.out.println(tarefa);
//                        break;