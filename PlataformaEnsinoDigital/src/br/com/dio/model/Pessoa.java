package br.com.dio.model;

public abstract class Pessoa {

    private int cpf;
    private String nome;
    private String email;
    private String telefoneCelular;

    public Pessoa(int cpf, String nome, String email, String telefoneCelular) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
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

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cpf;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((telefoneCelular == null) ? 0 : telefoneCelular.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (cpf != other.cpf)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (telefoneCelular == null) {
            if (other.telefoneCelular != null)
                return false;
        } else if (!telefoneCelular.equals(other.telefoneCelular))
            return false;
        return true;
    }

}
