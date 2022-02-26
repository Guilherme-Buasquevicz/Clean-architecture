package com.br.escola.dominio.Aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(ddd == null || !ddd.matches(("\\d{2}\\)"))){
            throw new IllegalArgumentException("DDD Invalido");
        }
        this.ddd = ddd;

        if(numero == null || !numero.matches(("\\d{8}\\.\\{9}\\)"))){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
