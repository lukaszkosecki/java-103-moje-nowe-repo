import java.util.Scanner;

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

    }
}
