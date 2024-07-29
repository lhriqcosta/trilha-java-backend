package br.com.dio.model;

public class Curso extends Conteudo {

    public Curso(String titulo, String descricao, int horas) {
        super(titulo, descricao, horas);

    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() +
                "\nDescrição: " + getDescricao() +
                "\nHoras: " + getHoras();
    }

}
