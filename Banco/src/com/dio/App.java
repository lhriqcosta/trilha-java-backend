package com.dio;

import com.dio.model.Cliente;
import com.dio.model.Conta;
import com.dio.model.ContaCorrente;
import com.dio.model.ContaPoupanca;
import com.dio.repository.ContasClientes;
import com.dio.service.BancoServicos;

public class App {
    public static void main(String[] args) {

        System.out.println("Banco Digital");

        ContasClientes contasClientes = new ContasClientes();
        BancoServicos bancoServicos = new BancoServicos(contasClientes);

        Cliente cliente1 = new Cliente(123456789, "Ana Silva", "ana.silva@example.com", "Rua das Flores, 123",
                "11987654321");
        Cliente cliente2 = new Cliente(234567890, "Bruno Costa", "bruno.costa@example.com", "Avenida Paulista, 456",
                "11987654322");
        Cliente cliente3 = new Cliente(345678901, "Carla Mendes", "carla.mendes@example.com", "Rua dos Jacarandás, 789",
                "11987654323");

        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente2);
        ContaCorrente contaCorrente3 = new ContaCorrente(cliente3);

        contasClientes.adicionarConta(contaCorrente1);
        contasClientes.adicionarConta(contaPoupanca2);
        contasClientes.adicionarConta(contaCorrente3);

        bancoServicos.depositarDinheiro(contaCorrente1.getNumeroConta(), 1000.0);
        bancoServicos.depositarDinheiro(contaPoupanca2.getNumeroConta(), 1500.0);
        bancoServicos.depositarDinheiro(contaCorrente3.getNumeroConta(), 2000.0);

        bancoServicos.sacarDinheiro(contaCorrente1.getNumeroConta(), 250.0);

        bancoServicos.transferirDinheiro(contaCorrente3.getNumeroConta(), contaPoupanca2.getNumeroConta(), 500.0);

        for (Conta conta : contasClientes.getContas()) {
            System.out.println(conta);
        }
    }

}
