import java.util.Scanner ;

public class PRAK101_2210817210025_MuhammadKholidSyaifullah {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in) ;
        System.out.print ("Masukkan Nama Lengkap : ") ;
        String nama = masuk.nextLine() ;
        System.out.print ("Masukkan Tempat Lahir : ") ;
        String tmptlahir = masuk.nextLine() ;
        System.out.print ("Masukkan Tanggal Lahir : ") ;
        int tgllahir = masuk.nextInt() ;
        System.out.print ("Masukkan Bulan Lahir : ") ;
        int blnlahir = masuk.nextInt() ;
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"} ;
        System.out.print ("Masukkan Tahun Lahir : ") ;
        int thnlahir = masuk.nextInt() ;
        System.out.print ("Masukkan Tinggi Badan : ") ;
        int tinggi = masuk.nextInt() ;
        System.out.print ("Masukkan Berat Badan : ") ;
        float berat = masuk.nextFloat() ;
        System.out.println ("Nama Lengkap " + nama + ", Lahir di " + tmptlahir + " pada Tanggal " + tgllahir + " " + bulan [ blnlahir - 1] + " " + thnlahir) ;
        System.out.println ("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram") ;
        masuk.close() ;
    }
}