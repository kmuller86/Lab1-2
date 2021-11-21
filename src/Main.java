
/* zad1. stworzyć tablicę typu double 5-cio elementową,
przypisać do niej wartości i wyświetlić */
/* Tablice - cw_6 */
public class Main {

    public static void main(String[] args) {



        int []tab1 = new int[5];
        tab1[0] = 1;
        tab1[1]=2;
        tab1[2]=3;
        tab1[3]=1000;
        tab1[4]=50000;
        System.out.println(tab1.length);
        for (int a : tab1) {
            System.out.println(a + " dodatkowy napis");

        }


    }
}
