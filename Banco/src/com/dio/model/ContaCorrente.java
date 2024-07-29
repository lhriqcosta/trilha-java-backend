package com.dio.model;

public class ContaCorrente extends Conta {

    private static final double LIMITE_CHEQUE_ESPECIAL = 500.0;

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + LIMITE_CHEQUE_ESPECIAL) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

}
