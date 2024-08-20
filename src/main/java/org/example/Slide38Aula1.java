package org.example;

import java.util.Scanner;

public class Slide38Aula1 {
    int qtdeIrmaos;
    char sexo='F';
    double minhaAltura=1.65f;
    String meuNome="Rosi Teixeira";
    final int MES_NASCIMENTO = 12;

    Scanner ler = new Scanner(System.in);

    public void exibirInformacoes() {

        System.out.println("Informe a quantidade de irmãos:");
        qtdeIrmaos = ler.nextInt();

        System.out.println("Olá! Meu nome é " + meuNome);
        System.out.println("Sexo : " + sexo);
        System.out.println("Altura : " + minhaAltura);
        System.out.println("Mes de Nascimento : " + MES_NASCIMENTO);
        System.out.println("A quantidade de irmãos é: "+ qtdeIrmaos);
    }
}
