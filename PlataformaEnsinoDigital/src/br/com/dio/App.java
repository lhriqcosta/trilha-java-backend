package br.com.dio;

import java.time.format.DateTimeFormatter;

import br.com.dio.model.Bootcamp;
import br.com.dio.model.Conteudo;
import br.com.dio.model.Curso;
import br.com.dio.model.Dev;
import br.com.dio.model.Mentoria;
import br.com.dio.repository.RepositorioBootcamps;
import br.com.dio.service.ServicosBootcamp;

public class App {
    public static void main(String[] args) {
        System.out.println("Plataforma de Ensino\n");

        RepositorioBootcamps repositorioBootcamps = new RepositorioBootcamps();
        ServicosBootcamp servicosBootcamp = new ServicosBootcamp(repositorioBootcamps);

        Bootcamp bootcampJava = new Bootcamp("Java", "Curso de desenvolvimento Java");
        Bootcamp bootcampPython = new Bootcamp("Python", "Curso de desenvolvimento Python");
        Bootcamp bootcampKotlin = new Bootcamp("Kotlin", "Curso de desenvolvimento Kotlin");

        servicosBootcamp.adicionarBootcampRepositorio(bootcampJava);
        servicosBootcamp.adicionarBootcampRepositorio(bootcampPython);
        servicosBootcamp.adicionarBootcampRepositorio(bootcampKotlin);

        Dev dev1 = new Dev(123456789, "Alice Oliveira", "alice.oliveira@dio.com", "(11) 98765-4321");
        Dev dev2 = new Dev(987654321, "Jorge Santos", "jorge.santos@dio.com", "(21) 97654-3210");
        Dev dev3 = new Dev(135792468, "Carlos Pereira", "carlos.pereira@dio.com", "(31) 96543-2109");

        servicosBootcamp.adicionarDev(bootcampJava, dev1);
        servicosBootcamp.adicionarDev(bootcampJava, dev2);
        servicosBootcamp.adicionarDev(bootcampPython, dev3);
        servicosBootcamp.adicionarDev(bootcampKotlin, dev1);

        Conteudo mentoriaInicial = new Mentoria("Aula inicial", "Primeiros passos no curso", 5);
        Conteudo cursoLogica = new Curso("Lógica de Programação", "Primeira aula", 15);
        Conteudo cursoPoo = new Curso("Programação Orientada a Objetos", "Segunda aula", 20);

        servicosBootcamp.adicionarConteudo(bootcampJava, mentoriaInicial);
        servicosBootcamp.adicionarConteudo(bootcampJava, cursoLogica);
        servicosBootcamp.adicionarConteudo(bootcampJava, cursoPoo);
        servicosBootcamp.adicionarConteudo(bootcampPython, mentoriaInicial);
        servicosBootcamp.adicionarConteudo(bootcampKotlin, cursoLogica);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Bootcamp bootcamp : repositorioBootcamps.getBootcamps()) {
            System.out.println("Bootcamp: " + bootcamp.getNome());
            System.out.println("Descrição: " + bootcamp.getDescricao());
            System.out.println("Horas Totais: " + bootcamp.getTotalHoras());
            System.out.println("Data Inicial: " + bootcamp.getDataInicial().format(formatter));
            System.out.println("Data Final: " + bootcamp.getDataFinal().format(formatter));
            System.out.println("Devs Inscritos:");
            bootcamp.getDevsInscritos().forEach(dev -> System.out.println("  - " + dev.getNome()));
            System.out.println("Conteúdos:");
            bootcamp.getConteudos().forEach(conteudo -> System.out.println("  - " + conteudo.getTitulo()));
            System.out.println();
        }

    }
}
