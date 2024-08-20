package org.example;

import java.util.ArrayList;

public class Slide119Aula4 {

    public static void main(String[] args) {
        // Estrutura pra numerar as casas
        ArrayList<Integer> casas = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            casas.add(i + 1);
        }

        int aumentaInt = 1;
        long aumentaLong = 0L;
        boolean overflowOccurred = false;

        for (int casa : casas) {
            try {
                if (!overflowOccurred) {
                    // Math.multiplyExact é utilizado pra realizar a multiplicação de maneira direta, se não conseguir gera a execeção
                    aumentaInt = Math.multiplyExact(aumentaInt, 2);
                    System.out.println("INT - Casa " + casa + ": " + aumentaInt + " grãos");
                } else {
                    aumentaLong *= 2;
                    System.out.println("LONG - Casa " + casa + ": " + aumentaLong + " grãos");
                }
                //Quando gerar a exceção, exibe a casa que deu o erro
            } catch (ArithmeticException e) {
                System.out.println("Overflow em 'int' na casa " + casa);

                // Converte pra long e continua até o final
                overflowOccurred = true;
                aumentaLong = (long) aumentaInt * 2;
                System.out.println("LONG - Casa " + casa + ": " + aumentaLong + " grãos");
            }
        }
    }
}
