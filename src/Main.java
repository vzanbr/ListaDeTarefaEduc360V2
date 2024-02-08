import java.io.*;
import java.util.*;

public class Main {

    public static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {

        boolean ativo = true;
        while (ativo) {
            System.out.println("==============================");
            System.out.println("1 - Acessar Lista");
            System.out.println("2 - Sair do programa");
            System.out.println("==============================");
            System.out.print("Digite a opção: ");
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("==============================");
                    System.out.println("Carregando e indo para lista!");
                    System.out.println("==============================");
                    proximaPagina();
                    break;
                }
                case "2": {
                    ativo = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }
        System.out.println("Fim do Programa By Gabriel Alves de Lima");
        System.out.println("Meu Site https://vzanbr.github.io/Gabriel-Lima ");
    }

    public static void proximaPagina() {

            ArrayList<Tarefa> listaTarefas = new ArrayList<>();

        boolean ativo = true;
        while (ativo) {
            System.out.println("=========Lista=======");
            System.out.println("1 - Minhas Tarefas");
            System.out.println("2 - Adcionar Tarefa");
            System.out.println("3 - Remover Tarefa");
            System.out.println("4 - Listar Tarefas em Ordem Alfabética");
            System.out.println("5 - Listar Tarefas em Ordem Cronológica");
            System.out.println("6 - Salvar no Computador em formato TXT");
            System.out.println("9 - sair");
            System.out.println("====================");
            System.out.print("Digite a Opção: ");
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "1":
                    for (Tarefa tarefa : listaTarefas)
                        System.out.println(tarefa);
                    break;

                case "2":
                    Tarefa tarefas = new Tarefa();
                    System.out.println("=====Tarefa Nova=====");
                    System.out.print("Digite a descrição: ");
                    String tarefaResposta = leitor.nextLine();

                    if (tarefaResposta.isEmpty()) {
                        System.out.println("A descrição da tarefa não pode ser vazia.");
                        return;
                    }
                    tarefas.setNomeTarefa(tarefaResposta);

                        boolean tarefaExistente = false;
                        for (int j = 0; j < listaTarefas.size(); j++) {
                            if (tarefaResposta.equals(listaTarefas.get(j).getNomeTarefa())) {
                                tarefaExistente = true;
                                System.out.println("Já existe uma tarefa com o mesmo nome! " + " [" + tarefaResposta+ "] ");
                                break;
                            }
                        }
                        if (!tarefaExistente) {
                            listaTarefas.add(new Tarefa(tarefas.getId(), tarefas.getNomeTarefa()));
                            System.out.println( "Tarefa " + " [" + tarefaResposta + "] " +  " Adicionada com sucesso!");
                        }
                            for (Tarefa tarefa : listaTarefas)
                            System.out.println(tarefa);
                    break;


                case "3":
                    System.out.println("Digite o id da tarefa: ");
                    Scanner entradaRemoverTarefa = new Scanner(System.in);
                    int removerTarefa = entradaRemoverTarefa.nextInt();
                    System.out.println("Tem certeza que deseja remover a Tarefa " + " [" + removerTarefa + "] " + " ?(S / N)");
                    String escolha = entradaRemoverTarefa.next();
                    int sizeList = listaTarefas.size();

                    if (escolha.equals("S") || escolha.equals("s"))
                        listaTarefas.removeIf(tarefa -> tarefa.getId() == removerTarefa);

                        if (listaTarefas.size() < sizeList) {
                            System.out.println("Tarefa selecionado removida com sucesso");
                        } else {
                            System.out.println("Tarefa com ID " + removerTarefa + " não encontrada.");
                        }
                    break;

                case "4":
                    listaTarefas.sort(Tarefa.COMPARATOR_BY_NOME);
                    System.out.println(listaTarefas);
                    break;

                case "5":
                    listaTarefas.sort(Tarefa.COMPARATOR_BY_ID);
                    System.out.println(listaTarefas);
                    break;

                case "6":
                    System.out.println("Escolha um nome para o arquivo:");
                    String nomeArquivo = leitor.nextLine();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo + ".txt"))) {
                        for (Tarefa tarefa : listaTarefas) {
                            writer.write(tarefa.getNomeTarefa());
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        System.out.println("erro");
                    }
                    break;

                case "9":
                    ativo = false;
                    System.out.println("Saindo da lista!");
                    break;

                default:
                    System.out.println("Comando invalido");
            }
        }
    }
}