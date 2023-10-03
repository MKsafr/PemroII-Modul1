import java.util.Scanner ;

public class PRAK103_2210817210025_MuhammadKholidSyaifullah {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in) ;
        int baris = masuk.nextInt() ;
        int angka = masuk.nextInt() ;

        if (angka % 2 == 0) {
            angka += 1 ;
        }

        do {
            System.out.print(angka) ;
            if (baris != 1) {
                System.out.print(", ") ;
            }
            baris -= 1 ; angka += 2 ;
        }
        while (baris > 0) ;
        masuk.close() ;
    }
}
