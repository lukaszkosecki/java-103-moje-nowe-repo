import java.util.Scanner;

public class Zad3Równaniekwadratowe {
    public static void main(String[] args) {
        System.out.println("Podaj parametry:");
        Scanner scaner = new Scanner(System.in);
        double a = scaner.nextDouble();
        double b = scaner.nextDouble();
        double c = scaner.nextDouble();

        double delta = b*b - 4* a*c;

        if(delta > 0){
            delta = Math.sqrt(delta);
            double x1 = (-b - delta)/(2 * a);
            double x2 = (-b + delta)/(2 * a);
            System.out.println("Pierwiastki równania to x1: " + x1 + " oraz x2: " + x2);
        }
        else if (delta == 0)
        {
            double x0 = -b/(2*a);
            System.out.println("Pierwiastek przy delta = 0 to "+ x0);
        }
        else if (delta < 0){
            System.out.println(" Delta ujemna");
        }


    }
}
