import java.util.Scanner;

class Fibonacci{
        public int Fibonacci(int n){
            switch(n){
                case 0 : return 0;
                case 1 : return 1;
                default: return Fibonacci(n-1) + Fibonacci(n-2);
            }
        }
    }
    public class Zad7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i,n = 10;
        Fibonacci liczby = new Fibonacci();

        System.out.println("Program znajduje rekurencyjnie " + n + " pierwszych liczb Fibonacciego.");
        System.out.println();

        for (i = 1; i < n; i++){
            System.out.print(liczby.Fibonacci(i) + " ");
        }

    }
}
