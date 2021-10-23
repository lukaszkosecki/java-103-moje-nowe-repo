import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        double increase;
        double body_weight;
        double bmi;

        System.out.println("Podaj swój wzrost ");
        increase = scan.nextDouble();

        System.out.println("Podaj swoja wagę [w kg] ");
        body_weight = scan.nextDouble();

        bmi = body_weight/Math.pow(increase,2);

        System.out.println("BMI wynosi: " + bmi);

    }
}
