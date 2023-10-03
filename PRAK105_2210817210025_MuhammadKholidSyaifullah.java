import java.util.Scanner ;

public class PRAK105_2210817210025_MuhammadKholidSyaifullah {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in) ;
        System.out.print("Masukkan jari-jari : ") ;
        Double r = masuk.nextDouble() ;
        System.out.print("Masukkan tinggi : ") ;
        Double t = masuk.nextDouble() ;
        Double phi = 3.14 ;
        Double hasil = phi * r * r * t ;
        System.out.printf("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah %.3f m^3", hasil) ;
        masuk.close() ;
    }
}
