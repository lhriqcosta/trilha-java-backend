package com.dio.model;

public abstract class Conta {

    private static final int AGENCIA = 1000;
    private static int SEQUENCIAL = 1;

    private int numeroAgencia;
    private int numeroConta;
    protected double saldo;
    private Cliente titular;

    public Conta(Cliente titular) {
        this.numeroAgencia = AGENCIA;
        this.numeroConta = SEQUENCIAL++;
        this.saldo = 0.0;
        this.titular = titular;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Cliente: " + titular.getNome() +
                "\nAgência: " + AGENCIA +
                "\nNúmero da Conta: " + numeroConta +
                "\nSaldo: " + saldo +
                "\n--------------------------------";
    }

}
