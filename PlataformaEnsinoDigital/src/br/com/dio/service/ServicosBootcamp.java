package br.com.dio.service;

import br.com.dio.model.Bootcamp;
import br.com.dio.model.Conteudo;
import br.com.dio.model.Dev;
import br.com.dio.repository.RepositorioBootcamps;

public class ServicosBootcamp {

    private final RepositorioBootcamps repositorioBootcamps;

    public ServicosBootcamp(RepositorioBootcamps repositorioBootcamps) {
        this.repositorioBootcamps = repositorioBootcamps;
    }

    public void adicionarBootcampRepositorio(Bootcamp bootcamp) {
        repositorioBootcamps.adicionarBootcamp(bootcamp);
    }

    public void adicionarDev(Bootcamp bootcamp, Dev dev) {
        bootcamp.adicionarDev(dev);
    }

    public void adicionarConteudo(Bootcamp bootcamp, Conteudo conteudo) {
        bootcamp.adicionarConteudo(conteudo);
    }
}
