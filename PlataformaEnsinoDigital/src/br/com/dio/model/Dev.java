package br.com.dio.model;

public class Dev extends Pessoa {

    public Dev(int cpf, String nome, String email, String telefoneCelular) {
        super(cpf, nome, email, telefoneCelular);
    }

    @Override
    public String toString() {
        return "Dev: ";
    }

}
