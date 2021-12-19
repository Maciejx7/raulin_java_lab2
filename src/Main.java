import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        Scanner scan = new Scanner((System.in));
        System.out.println("Podaj liczbę: ");
        switch (scan.nextInt() % 2){
            case 1:
                System.out.println("Liczba nie jest parzysta");
                break;
            default:
                System.out.println("Liczba jest parzysta");
                break;
        }
        switch (scan.nextInt() % 7){
            case 1:
            System.out.println("Liczba nie jest podzielna przez 7");
            break;

            default:
                System.out.println("Liczba jest podzielna przez 7");
            break;
        }
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int tab[] = {0,0,0,0,0,0};
        for (char a: text.toCharArray ()){
            switch (a){

                case 'o':
                    ++tab[0];
                    break;
                case'p':
                    ++tab[1];
                    break;
                case'x':
                    ++tab[2];
                    break;
                case'z':
                    ++tab[3];
                    break;
                case'q':
                    ++tab[4];
                    break;
                default :
                    ++tab[5];
            }

        }
        System.out.printf("\nW wyrazie znajduje się:\no: %d razy\np: %d razy\nx: %d razy\nz: %d razy\nq: %d razy\nPozostałych: %d liter",
                tab[0], tab[1], tab[2],tab[3],tab[4],tab[5]);

    }
}
