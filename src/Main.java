import java.util.ArrayList;
import java.util.Collections;
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
                    System.out.println("Saindo da lista!");
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.println("Fim do Programa By Gabriel Alves de Lima");
        }
    }
        public static void proximaPagina() {

            ArrayList<String> listTarefas = new ArrayList<>( );
            ArrayList lista = new ArrayList<>();

            boolean ativo = true;
            while (ativo) {
                System.out.println("========Lista=========");
                System.out.println("1 - Minhas tarefas");
                System.out.println("2 - Adcionar tarefa");
                System.out.println("3 - Remover tarefa");
                System.out.println("4 - Organizar tarefa");
                System.out.println("5 - Sair da Lista");
                System.out.print("Digite o Opção : ");

                String opcao = leitor.nextLine();

                switch (opcao) {
                    case "1": {
                        System.out.println("==============================");
                        System.out.println("Listar tarefas do dia: ");
                        System.out.println("==============================");
                        for (String a : listTarefas) {
                            System.out.println(a);
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("=====Tarefa Nova=====");
                        System.out.print("Digite a descrição: ");
                        String tarefa = leitor.nextLine();
                        listTarefas.add(tarefa);
                        tarefa.contains(tarefa);
                        System.out.println("Tarefa adicionada com sucesso!" );
                        break;
                    }
                    case "3": {
                        System.out.println("Digite o nome da Tarefa" );
                        String tarefaRemover = leitor.nextLine();
                        if (listTarefas.remove(tarefaRemover)){

                            System.out.println("=====Tarefa Removida=====");
                            System.out.println(tarefaRemover + "Foi removido com sucesso!");

                        } else {
                            System.out.println("A tarefa não esta na lista:" );
                        }
                        break;
                    }
                    case "4": {
                        System.out.println("=======Tarefas organizadas=====" );
                        Collections.sort(listTarefas);
                        System.out.println(listTarefas);
                        System.out.println("=======Tarefas organizadas=====" );
                        break;
                    }
                    case "5": {
                        System.out.println("Saindo da Lista!");
                        ativo = false;
                        break;
                    }
                    default:
                        System.out.println("opção inválida. TENTE NOVAMENTE.");
                }
            }
        }
}