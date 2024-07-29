package br.com.dio.model;

public class Mentoria extends Conteudo {

    public Mentoria(String titulo, String descricao, int horas) {
        super(titulo, descricao, horas);
    }

    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() +
                "\nDescrição: " + getDescricao() +
                "\nHoras: " + getHoras();
    }

}
