import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
          /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        List lista1 = new ArrayList<>();
        System.out.println("Podaj nazwe zwierzaka");
        Scanner a = new Scanner(System.in);
        String b =a.nextLine();
        for (int i = 0; i < b.length(); i++){
            System.out.println(b);
        }
        lista1.add(a);


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        System.out.println("Podaj 10 liczb");
        Scanner in = new Scanner (System.in);
        Set<Integer> liczba= new TreeSet<>();

        for(int i = 0;i<10;i++){
            int cyfra = in.nextInt();

            liczba.add(cyfra);
        }
        System.out.println("Liczby: "+liczba);
        metoda(liczba);
    }
    public static void metoda(Set<Integer> number){
        int i=0;
        for(Integer x :number){
            System.out.println("Liczba "+(i+1)+" :"+x);

            i++;
        }
    }
}
