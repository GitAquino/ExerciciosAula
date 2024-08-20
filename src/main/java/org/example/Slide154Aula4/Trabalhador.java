package org.example.Slide154Aula4;

public abstract class Trabalhador {
    private String nome;
    private String sobrenome;

    public Trabalhador(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public abstract double gerarSalario();
}