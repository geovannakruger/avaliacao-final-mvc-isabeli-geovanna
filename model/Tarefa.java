package model;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private String prioridade;
    private int prazo;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, String prioridade, int prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.prazo = prazo;
        this.concluida = false;
    }

    public String getTitulo() { 
        return titulo; }
    public String getDescricao() { 
        return descricao; }
    public String getPrioridade() { 
        return prioridade; }
    public int getPrazo() { 
        return prazo; }
    public boolean isConcluida() { 
        return concluida; }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    
}

