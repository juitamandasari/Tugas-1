/* Nim          : 13020210094
   Nama         : Juita Mandasari
   Hari/Tanggal : Selasa 07/03/2023
   Waktu	    : 21.26 WITA */

import java.util.Scanner;

public class KonversiWaktu{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int totJam, jam, totMen, menit, detik, konversi;
    
        System.out.print ("Masukkan total detik : ");
        konversi = input.nextInt();

       detik = konversi % 60;
       totMen = konversi / 60;
       menit = totMen % 60;
       totJam = totMen / 60;
       jam = totJam % 24;

        System.out.println("Detik sekarang      : "+detik+ "detik");
        System.out.println("Total menit         : "+totMen+ "menit");
        System.out.println("Menit sekarang      : "+menit+ "menit");
        System.out.println("Total menit         : "+totJam+ "jam");
        System.out.println("Detik sekarang      : "+jam+ "jam");
        System.out.println("Total menit         : "+jam+ ":"+ menit +":"+detik);

    }
}
