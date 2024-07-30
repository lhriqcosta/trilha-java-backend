package br.dio.com.service;

import br.dio.com.model.Pessoa;
import br.dio.com.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final AgendaRepository agendaRepository;

    @Autowired
    public PessoaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public List<Pessoa> getAllPessoas() {
        return agendaRepository.findAll();
    }

    public Optional<Pessoa> getPessoaById(Long id) {
        return agendaRepository.findById(id);
    }

    public Pessoa createPessoa(Pessoa pessoa) {
        return agendaRepository.save(pessoa);
    }

    public Pessoa updatePessoa(Long id, Pessoa pessoaDetails) {
        return agendaRepository.findById(id)
                .map(pessoa -> {
                    pessoa.setNome(pessoaDetails.getNome());
                    pessoa.setEmail(pessoaDetails.getEmail());
                    pessoa.setTelefone(pessoaDetails.getTelefone());
                    return agendaRepository.save(pessoa);
                }).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }

    public void deletePessoa(Long id) {
        agendaRepository.deleteById(id);
    }
}
