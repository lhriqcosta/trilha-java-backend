package com.dio.repository;

import java.util.ArrayList;
import java.util.List;

import com.dio.model.Conta;

public class ContasClientes {

    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public List<Conta> getContas() {
        return contas;
    }

}
