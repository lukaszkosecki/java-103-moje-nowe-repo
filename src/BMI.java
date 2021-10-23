import java.util.Scanner;
/*
Napisz program obliczający BMI (Body Mass Index) i sprawdzający, czy jest ono w normie.
Program powinien wczytywać od użytkownika dwie zmienne: wagę w kilogramach (typ float) oraz wzrost w centymetrach (typ int).
BMI powinno zostać wyliczone zgodnie z poniższym wzorem:
Optymalny zakres BMI wynosi od 18.5 do 24.9, wartości mniejsze lub większe są wartościami nieoptymalnymi.
Twój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie z powyższymi założeniami.
 */
public class BMI {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        double increase,body_weight,bmi;


        System.out.println("Podaj swój wzrost [w metrach]");
        increase = scan.nextDouble();

        System.out.println("Podaj swoja wagę [w kg] ");
        body_weight = scan.nextDouble();

        bmi = body_weight/Math.pow(increase,2);

        System.out.println("BMI wynosi: " + bmi);

        if(bmi < 18.5){
            System.out.println("Wartość BMI jest nieoptymalna");
        }
        if(bmi > 24.9){
            System.out.println("Wartość BMI jest nieoptymalna");
        }
        else {
            System.out.println("Wartość BMi jest optymalna");
        }

    }
}
