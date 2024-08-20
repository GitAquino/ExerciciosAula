package org.example;

public class Slide71Aula2 {

        public void execExercicio71(){

            int x = 13;
            int y;

            while (x != 1) {
                if (x % 2 == 0) {
                    y = x / 2;
                } else {
                    y = 3 * x + 1;
                }
                System.out.println("y = " + y);

                x = y;
            }
    }

}
