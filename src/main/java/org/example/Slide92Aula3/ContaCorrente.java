package org.example.Slide92Aula3;

public class ContaCorrente {
    private String numero;
    private String tipo;
    private Cliente primeiroTitular;
    private Cliente segundoTitular;
    private double saldo;
    private double limiteTotal;

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, Cliente segundoTitular, double saldo, double limiteTotal) {
        this.numero = numero;
        this.tipo = tipo;
        this.primeiroTitular = primeiroTitular;
        this.segundoTitular = segundoTitular;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;
    }

    public void credito(double valor) {
        saldo += valor;
    }

    public void debito(double valor) {
        saldo -= valor;
    }

    public void resumo() {
        System.out.println("Número da Conta Corrente: " + numero);
        System.out.println("Nome do Primeiro Titular: " + primeiroTitular.getNome());
        if (segundoTitular != null) {
            System.out.println("Nome do Segundo Titular: " + segundoTitular.getNome());
        }
        System.out.println("Saldo Atual: R$ " + saldo);
        System.out.println("Limite Atual: R$ " + (limiteTotal + saldo));
        System.out.println("Limite Total: R$ " + limiteTotal);
        if (estaDevedor()) {
            System.out.println("Saldo negativo! Procure o seu gerente!");
        }
    }

    public boolean estaDevedor() {
        return saldo < 0;
    }
}
