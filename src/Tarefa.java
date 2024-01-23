
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarefa {

    public static void addTarefa(ArrayList<String> listaTarefas) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("=====Tarefa Nova=====");
        System.out.print("Digite a descrição: ");
        String tarefaResposta = leitor.nextLine();
        {
            if (!listaTarefas.contains(tarefaResposta)) {
                listaTarefas.add(tarefaResposta);
                System.out.println("Tarefa " + tarefaResposta + " adicionada com sucesso!");
            } else {
                System.out.println("Ja existe tarefa com o mesmo nome!");
            }

        }
    }

    public static void RemoverTarefa(ArrayList<String> listaTarefas){

        for (int i = 1; i-1 < listaTarefas.size(); i++) {
            System.out.println(i + "- " + listaTarefas.get(i-1));
        }
        System.out.print("Digite o número da tarefa que deseja remover: ");
        Scanner entradaRemoverTarefa = new Scanner(System.in);
        int removerTarefa = entradaRemoverTarefa.nextInt();
        boolean verificador = listaTarefas.size() < removerTarefa;
        if (verificador) {
            System.out.println("Lista não possui nenhuma tarrefa com esse número");
        } else {
            System.out.println("Deseja realmente excluir a tarefa " + removerTarefa + "? Escreva Com S maiusculo Para confirmar");
            String resposta = entradaRemoverTarefa.next();
            if (resposta.equals("S")) {
                listaTarefas.remove(removerTarefa - 1);
                System.out.println("tarefa " + removerTarefa + " Removida com sucesso!");
                System.out.println("Lista : " + listaTarefas);
            } else {
                System.out.println("Falha para excluir " + resposta + " tarefa!");
            }
        }
    }
    public static void VerTarefas(ArrayList<String> listaTarefas){
        for (String tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
    }

    public static void organizarTarefas (ArrayList<String> listaTarefas){
        System.out.println("=======Tarefas organizadas=====" );
        Collections.sort(listaTarefas);
        System.out.println(listaTarefas);
        System.out.println("=======Tarefas organizadas=====" );
    }

    public static void AlterarStatus(ArrayList<String> listaTarefas){
        for (int i = 1; i-1 < listaTarefas.size(); i++) {
            System.out.println(i + "- " + listaTarefas.get(i-1));
        }
        System.out.print("Digite o número da tarefa que deseja altrar o status: ");
        Scanner entradaAlterarTarefa = new Scanner(System.in);
        int alterarTarefa = entradaAlterarTarefa.nextInt();
        if (listaTarefas.size() < alterarTarefa) {
            System.out.println("[ERRO] número invalido");
        } else {
            System.out.println("Status alterado com sucesso");
            if (listaTarefas.get(alterarTarefa - 1).charAt(1) == 'X') {
                listaTarefas.set(alterarTarefa - 1, "[ ]" + listaTarefas.get(alterarTarefa - 1).substring(3));
            } else {
                listaTarefas.set(alterarTarefa - 1, "[X]" + listaTarefas.get(alterarTarefa - 1).substring(3));
            }
        }
    }
    public static void Salvar(ArrayList<String> listaTarefas){
        System.out.println("Escolha um nome para o arquivo:");
        Scanner entradaNomeArquivo = new Scanner(System.in);
        String nomeArquivo = entradaNomeArquivo.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo + ".txt"))) {
            for (String tarefa : listaTarefas) {
                writer.write(tarefa);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("erro");
        }
    }
    public static void RecuperarLista(ArrayList<String> listaTarefas){
        System.out.println("Digite o nome da lista que você quer recuperar:");
        Scanner entradaNomeArquivo = new Scanner(System.in);
        String nomeArquivo = entradaNomeArquivo.nextLine();
        try (BufferedReader reader =new BufferedReader(new FileReader(nomeArquivo + ".txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                listaTarefas.add(linha);
            }
        }catch (IOException e) {
            System.out.println("erro");
        }
    }
}