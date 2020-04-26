package domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {
    public static void Calculate() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstWord, secondWord;
        System.out.println("Введите первое слово:");
        firstWord = reader.readLine();
        System.out.println("Введите второе слово:");
        secondWord = reader.readLine();

        char[] chArr1 = firstWord.toUpperCase().toCharArray();
        char[] chArr2 = secondWord.toUpperCase().toCharArray();

        for (int i = chArr1.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (chArr1[j] > chArr1[j + 1])
                {
                    char tmp = chArr1[j];
                    chArr1[j] = chArr1[j + 1];
                    chArr1[j + 1] = tmp;
                }
            }
        }
        for (int i = chArr2.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (chArr2[j] > chArr2[j + 1])
                {
                    char tmp = chArr2[j];
                    chArr2[j] = chArr2[j + 1];
                    chArr2[j + 1] = tmp;
                }
            }
        }

        String valueOfchar1 = String.valueOf(chArr1);
        String valueOfchar2 = String.valueOf(chArr2);
        valueOfchar1 = valueOfchar1.replaceAll(" ", "");
        valueOfchar2 = valueOfchar2.replaceAll(" ", "");
        System.out.println(valueOfchar1);
        System.out.println(valueOfchar2);

        System.out.println(valueOfchar1.equalsIgnoreCase(valueOfchar2));
    }
}