package br.com.dio.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private static int SEQUENCIAL = 1;

    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(60);

    private String nome;
    private String descricao;
    private int horas;
    private int id;
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = SEQUENCIAL++;
        atualizarHoras();
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
        atualizarHoras();
    }

    public void adicionarDev(Dev dev) {
        devsInscritos.add(dev);
    }

    public int getTotalXp() {
        return conteudos.stream().mapToInt(Conteudo::getXp).sum();
    }

    public int getTotalHoras() {
        return horas;
    }

    private void atualizarHoras() {
        this.horas = conteudos.stream().mapToInt(Conteudo::getHoras).sum();
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + horas;
        result = prime * result + id;
        result = prime * result + ((devsInscritos == null) ? 0 : devsInscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(other.dataInicial))
            return false;
        if (dataFinal == null) {
            if (other.dataFinal != null)
                return false;
        } else if (!dataFinal.equals(other.dataFinal))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (horas != other.horas)
            return false;
        if (id != other.id)
            return false;
        if (devsInscritos == null) {
            if (other.devsInscritos != null)
                return false;
        } else if (!devsInscritos.equals(other.devsInscritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }

}
