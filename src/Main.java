public class Main {
    public static void main(String[] args) {
      /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int x = 1000;

        int numer= 64;

        while ((--x) > 0) {

            System.out.print("\nnumer: " + x);

            if (x % numer == 0) {

                System.out.print(" - podzielna przez 64");
            }
        }
        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
                przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
    int[] a = {2, 3, 5, 7, 9};
    int i = 0;
        while (i < 5){
            System.out.print("\n "+a[i]);
            i++;
        }
        System.out.print("\nKoniec");
        double[] b = {1.2, 2.5, 3.7, 11.7, 15.1};
        int j = 0;

        while (j < 5) {
            System.out.println("\n"+b[j]);
            j++;
        }

        System.out.print("\nKoniec\n");
        String[] imiona= {"Marek", "Janek", "Maciek", "Kamil", "Halina"};
        int k = 0;

        while (k < imiona.length) {

            System.out.println(imiona[k]);
            k++;
        }
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        int z;
    while (true) {
        z++;
        System.out.println(z);
    }

        while (false)
            System.out.println(z);

            break;
        }
    }
}
