

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;
        boolean c = false;
        int x = 5;
        int y = 30;
        int z = 18;

        System.out.println("x == z(równość) : " + (x == z));
        System.out.println("x != y(różny) : " + (x != y));
        System.out.println("x < y(wiekszy, mniejszy)  : " + (x < y));
        System.out.println("x >= x(wiekszy/mniejszy równy) " + (x >= y));
        System.out.println("!(zaprzeczenie) x>y ||(lub) a &&(i) b : " + !((x > y) || a && c && b));


    }
}
