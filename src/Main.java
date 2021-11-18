public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

        byte male = 127;
        short wieksze = 32767;
        int wystarczajace = 2147483647;
        long Ogromne = 1841818185;
        String imie = "Mikołaj";
        double urodziny = 2.04;
        boolean cokolwiekzawszetruefalse = true;

        System.out.println(male);
        System.out.println(wieksze);
        System.out.println(wystarczajace);
        System.out.println(Ogromne);
        System.out.println(imie);
        System.out.println(urodziny);
        System.out.println(cokolwiekzawszetruefalse);


        //cw2

        int liczbaA = 100;
        int liczbaB = 10;

        double liczbaX = 125.125;
        double liczbaY = 5.125;


        System.out.println(liczbaA + liczbaB);
        System.out.println(liczbaA - liczbaB);
        System.out.println(liczbaA * liczbaB);
        System.out.println(liczbaA / liczbaB);
        System.out.println(liczbaB % liczbaA);

        System.out.println(liczbaX + liczbaY);
        System.out.println(liczbaX - liczbaY);
        System.out.println(liczbaX * liczbaY);
        System.out.println(liczbaY / liczbaX);
        System.out.println(liczbaY % liczbaX);
    }
}
