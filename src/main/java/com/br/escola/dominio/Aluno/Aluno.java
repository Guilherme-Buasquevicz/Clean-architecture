package com.br.escola.dominio.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(String nome, CPF cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

        public String getCpf() {
        return cpf.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
