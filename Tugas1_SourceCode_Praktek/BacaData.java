/* Nim          : 13020210094
   Nama         : Juita Mandasari
   Hari/Tanggal : Minggu 05/03/2023
   Waktu	    : 22.51 WITA */

   import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner */
    public class BacaData {

    /**
	 * @param args
	 */
     public static void main(String[] args) {
        // TODO Auto-generated method stub
		/* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik integer: \n");
        masukan = new Scanner (System.in);
        a = masukan.nextInt(); /* coba ketik : masukkan.nextInt(); Apa akibatnya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
     }

}