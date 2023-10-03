import java.util.Scanner ;

public class PRAK104_2210817210025_MuhammadKholidSyaifullah {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in) ;
        System.out.print("Tangan Abu : ") ;
        String abu = masuk.nextLine() ;
        System.out.print("Tangan Bagas : ") ;
        String bagas = masuk.nextLine() ;

        int poinabu = 0, poinbagas = 0 ;

        for (int i = 0 ; i < 5 ; i += 2) {
            if (abu.charAt(i) == 'G' && bagas.charAt(i) == 'K' || abu.charAt(i) == 'B' && bagas.charAt(i) == 'G' || abu.charAt(i) == 'K' && bagas.charAt(i) == 'B') {
                poinabu = poinabu + 1 ;
            }
            else if (bagas.charAt(i) == 'G' && abu.charAt(i) == 'K' || bagas.charAt(i) == 'B' && abu.charAt(i) == 'G' || bagas.charAt(i) == 'K' && abu.charAt(i) == 'B') {
                poinbagas = poinbagas + 1 ;
            }
        }

        if (poinabu > poinbagas) {
            System.out.print("Abu") ;
        }
        else if (poinbagas > poinabu) {
            System.out.print("Bagas") ;
        }
        else {
            System.out.print("Seri") ;
        }
        masuk.close() ;
    }
}
