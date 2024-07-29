package com.dio.model;

public class Cliente extends Pessoa {

    private boolean status;

    public Cliente(int cpf, String nome, String email, String endereco, String telefoneCelular) {
        super(cpf, nome, email, endereco, telefoneCelular);
        this.status = true;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
