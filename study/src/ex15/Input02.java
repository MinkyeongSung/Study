package ex15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input02 {

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);

        try {
            char[] ch = new char[50];
            ir.read(ch);

            for (char c : ch) {
                System.out.println(c);
            }
        } catch (Exception e) {
        }
    }
}
