import java.util.Scanner ;

public class PRAK102_2210817210025_MuhammadKholidSyaifullah {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in) ;
        int n = masuk.nextInt() ;
        int baris = 10 ;

        while (baris >= 0) {
            if (n % 5 == 0) {
                System.out.print((n / 5) - 1) ;
                if (baris != 0) {
                    System.out.print(",") ;
                }
            }
            else {
                System.out.print(n) ;
                if (baris != 0) {
                    System.out.print(",") ;
                }
            }
            baris -= 1 ; n += 1 ;
        }
        masuk.close() ;
    }
}
