public class Main {
    public static void main(String[] args) {
        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        System.out.print("liczby od 0 do 50 nie parzyste\n");
        for( int i = 1; i <= 100;i+=2){
            if(i==51)
                break;
            System.out.println(i+ " ");

        }
        System.out.print("Liczby pierwsze od 1 do 100;\n");
        int pierwsza;
        for( int j = 1; j <= 100;j++){
            pierwsza = 0;
            for (int k=2; k<=j/2; k++)
                if(j%k == 0){
                    pierwsza = 1;
                    continue;
                }
            if (pierwsza == 0)
                System.out.print(j + " ");
        }
        System.out.print("Jeżeli liczba jest większa niż 11 to przerywa\n");
        for (int i = 0; i <=100; i++){
            if (i > 11)
                return;
            System.out.print(i + " ");
        }
    }
}
