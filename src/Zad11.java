import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        /*
Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String)
tak długo, aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów
(nie biorąc pod uwagę tekstu „Starczy”). Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zdanie");
        String end = "Starczy";
        String zdanie = "";
        String najDluzszy = "";
        while(!zdanie.equals(end)){
            zdanie = scanner.nextLine();
            if(najDluzszy.length()<zdanie.length()){
                najDluzszy = zdanie;
            }
        }
        System.out.println(najDluzszy);
    }

}
