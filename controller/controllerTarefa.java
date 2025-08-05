package controller;
import model.Tarefa;
import java.util.ArrayList;
import java.util.List;


public class ControllerTarefa {
    private List<Tarefa> tarefas;
    private static ControllerTarefa termo;

    private ControllerTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public static ControllerTarefa getTermo() {
        if (termo == null) {
            termo = new ControladorTarefa();
        }
        return termo;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    public void marcarComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).setConcluida(true);
        }
    }

 
    
}