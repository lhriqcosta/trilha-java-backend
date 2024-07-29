package br.com.dio.repository;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.dio.model.Bootcamp;

public class RepositorioBootcamps {

    private final Set<Bootcamp> bootcamps = new LinkedHashSet<>();

    public void adicionarBootcamp(Bootcamp bootcamp) {
        bootcamps.add(bootcamp);
    }

    public Bootcamp buscarBootcamp(int id) {

        for (Bootcamp bootcamp : bootcamps) {
            if (bootcamp.getId() == id) {
                return bootcamp;
            }
        }
        return null;

    }

    public Set<Bootcamp> getBootcamps() {
        return new LinkedHashSet<>(bootcamps);
    }

}
