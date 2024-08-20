package org.example.Slide92Aula3;

public class ProgramaBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("11122233344", "Clodualdo Junior", "Av Brasil, 321", "2000");
        Cliente cliente2 = new Cliente("55566677789", "Bruno Ricardo", "Rua 8, 123", "1985");

        ContaCorrente conta = new ContaCorrente("1234-5", "Corrente", cliente1, cliente2, 1000.0, 5000.0);

        conta.credito(500.0);
        conta.credito(1200.0);
        conta.credito(900.0);
        conta.debito(1600.0);
        conta.debito(900.0);
        conta.debito(2400.0);

        conta.resumo();
    }
}
