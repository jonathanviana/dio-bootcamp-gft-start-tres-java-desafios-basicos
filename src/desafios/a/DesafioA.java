package desafios.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesafioA {
    public static void main(String[] args) throws IOException {
        String line;
        Double number;

        int positive = 0;
        int negative = 0;

        System.out.println("Favor, digitar 6 valores: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 6; i++) {
            line = br.readLine();
            number = Double.parseDouble(line);
            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("total de números positivos: " + positive);
        System.out.println("total de números negativos: " + negative);
    }
}