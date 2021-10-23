import java.util.Scanner;
/*
Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float)
        i obliczy obwód tego okręgu. Do obliczeń przyjmij najpierw π = 3.14,
        a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI.
*/
public class Zad1Circle {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Wprowadz srednice okręgu ");

        float userInput = scaner.nextFloat();
        float result = calculate(userInput);

        System.out.println("Pole kola to: " + result);

    }

    public static float calculate(float diameter) {

        float pole = (diameter / 2) * (float) (2 * Math.PI);
        return pole;
    }
}

