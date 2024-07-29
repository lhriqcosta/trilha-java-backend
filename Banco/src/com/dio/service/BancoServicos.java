package com.dio.service;

import com.dio.model.Cliente;
import com.dio.model.Conta;
import com.dio.model.ContaCorrente;
import com.dio.model.ContaPoupanca;
import com.dio.repository.ContasClientes;

public class BancoServicos {

    private ContasClientes contasClientes;

    public BancoServicos(ContasClientes contasClientes) {
        this.contasClientes = contasClientes;
    }

    public void criarContaCorrente(Cliente titular) {
        ContaCorrente conta = new ContaCorrente(titular);
        contasClientes.adicionarConta(conta);
    }

    public void criarContaPoupaca(Cliente titular) {
        ContaPoupanca conta = new ContaPoupanca(titular);
        contasClientes.adicionarConta(conta);
    }

    public void depositarDinheiro(int numeroConta, double valor) {
        Conta conta = contasClientes.buscarConta(numeroConta);
        if (validarConta(conta)) {
            conta.depositar(valor);
        }
    }

    public void sacarDinheiro(int numeroConta, double valor) {
        Conta conta = contasClientes.buscarConta(numeroConta);
        if (validarConta(conta)) {
            conta.sacar(valor);
        }
    }

    public void transferirDinheiro(int numeroContaOrigem, int numeroContaDestino, double valor) {
        Conta origem = contasClientes.buscarConta(numeroContaOrigem);
        Conta destino = contasClientes.buscarConta(numeroContaDestino);
        if (validarConta(origem) && validarConta(destino)) {
            origem.transferir(destino, valor);
        }
    }

    public Boolean validarConta(Conta conta) {
        if (conta != null) {
            return true;
        }
        return false;

    }

}
