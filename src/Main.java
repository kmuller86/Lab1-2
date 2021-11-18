import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Poodaj Imie: ");
        String imie = scan.next();

        System.out.print("Poodaj Nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj nr indeksu: ");
        int nrIndexu = scan.nextInt();


        System.out.printf("%s ,%s \n", imie , nazwisko);
        System.out.println("wiek: "+ wiek);
        System.out.println("nr indeksu: "+nrIndexu);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        System.out.print("Pierwsza liczba do obliczeń: ");
        int z1 = scan.nextInt();

        System.out.print("Druga liczba do obliczeń: ");
        int z2 = scan.nextInt();

        System.out.println("wynikiem dodawania jest");
        System.out.println(z1+z2);
        System.out.println("wynikiem odejmowania jest");
        System.out.println(z1-z2);
        System.out.println("wynikiem mnożenia jest");
        System.out.println(z1*z2);
        System.out.println("wynikiem dzielenia jest");
        System.out.println(z2/z1);
        System.out.println("wynikiem modulo jest");
        System.out.println(z1%z2);
        System.out.println(z1%z2);
    }
}
