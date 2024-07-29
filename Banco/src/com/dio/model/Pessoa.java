package com.dio.model;

public abstract class Pessoa {

    private int cpf;
    private String nome;
    private String email;
    private String endereco;
    private String telefoneCelular;

    public Pessoa(int cpf, String nome, String email, String endereco, String telefoneCelular) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefoneCelular = telefoneCelular;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

}
