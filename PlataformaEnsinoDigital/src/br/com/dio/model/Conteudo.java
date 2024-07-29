package br.com.dio.model;

public abstract class Conteudo {

    private static final int XP_PADRAO = 100;

    private String titulo;
    private String descricao;
    private int horas;
    private int xp;

    public Conteudo(String titulo, String descricao, int horas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.horas = horas;
        this.xp = horas * XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getHoras() {
        return horas;
    }

    public int getXp() {
        return xp;
    }

}
