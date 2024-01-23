import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) throws NullPointerException {

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

        ArrayList<String> listaTarefas = new ArrayList<>();

        boolean ativo = true;
        while (ativo) {
            System.out.println("=========Lista=======");
            System.out.println("1 - Minhas Tarefas");
            System.out.println("2 - Adcionar Tarefa");
            System.out.println("3 - Remover Tarefa");
            System.out.println("4 - Alterar status");
            System.out.println("5 - Organizar Tarefas");
            System.out.println("6 - Salvar no Computador em formato TXT");
            System.out.println("7 - Tarefas salvas em TXT Recuperar");
            System.out.println("9 - sair");
            System.out.println("======Fim da Lista======");
            System.out.print("Digite a Opção: ");
            String opcao = leitor.nextLine();


            switch (opcao) {
                case "1": {
                    Tarefa.VerTarefas(listaTarefas);
                    break;
                }
                case "2": {
                    Tarefa.addTarefa(listaTarefas);
                    break;
                }
                case "3": {
                    Tarefa.RemoverTarefa(listaTarefas);
                    break;
                }
                case "4": {
                    Tarefa.AlterarStatus(listaTarefas);
                    break;
                }
                case "5": {
                    Tarefa.organizarTarefas(listaTarefas);
                    break;
                }
                case "6": {
                    Tarefa.Salvar(listaTarefas);
                    break;
                }
                case "7": {
                    Tarefa.RecuperarLista(listaTarefas);
                    break;
                }
                case "9": {
                    ativo = false;
                    System.out.println("Saindo da lista!");
                    break;
                }

                default:
                    System.out.println("Comando invalido");
            }
        }
    }
}