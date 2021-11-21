import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 25;
        if (wiek % 3 == 0) {
            System.out.println("Mój wiek jest podzielny przez 3");
        } else {
            System.out.println("Mój wiek jest niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int index = 152999;
        int czyparzysta = (index % 2 == 0) ? 1 : 0;
        System.out.println("Jeżeli wynik 1(parzysta), Jeżeli wynik 0(nieparzysta): " + czyparzysta);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
System.out.println("Kalkulator bogactwa");
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj stan konta: ");
        double money = scan.nextDouble();

        if (money < 300000) {
            System.out.println(" Jeszcze musisz popracować");
        } else if (money >= 300000 && money < 1000000) {
            System.out.println("Coś już zaczyna się kręcić");

        } else if (money >= 1000000) {
            System.out.println("Jesteś bogaty");
        }

    }
}
