/* Nim          : 13020210094
Nama            : Juita Mandasari
Hari/Tanggal    : Selasa 07/03/2023
Waktu	        : 18.03WITA */

/* Contoh pengoperasian variabel bertype dasar */
public class Oprator{

    public static void main(String[] args){
        //TODO Auto-generated method stub
        /* Kamus */
            boolean Bool1, Bool2, TF;
            int i,j, hsl;
            float x,y,res;
        /* Algoritma */
   
        System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
           System.out.println("===================== OPERASI LOGIKA =====================");
           Bool1 = true; Bool2 = false;
           //AND
           System.out.print("AND  ==> "); 
            TF = Bool1 && Bool2 ;   /* Boolean AND */
           System.out.println(Bool1 + " && " + Bool2 + " = "+ TF );
           //OR
           System.out.print("OR   ==> "); 
            TF = Bool1 || Bool2 ; /* Boolean OR */
           System.out.println(Bool1 + " || " + Bool2 + " = "+ TF);
           //NOT
           System.out.print("NOT  ==> ");
            TF = ! Bool1 ; /* NOT */
            System.out.println("! " +Bool1+"        = "+ TF); 
            //XOR
            System.out.print("NOR  ==> ");
            TF = Bool1 ^Bool2 ; /* XOR */
            System.out.println(Bool1 + " ^ " + Bool2 + "  = "+ TF);
   
   
            /* operasi numerik */
            System.out.println("===================== OPERASI NUMERIK ====================");
            i = 5; j = 2;
            //Penjumlahan
            hsl = i + j;
           System.out.print("Penjumlahan ");
           System.out.println(i + " + " + j + " = " +hsl);
            //Pengurangan
            hsl = i - j;
            System.out.print("Pengurangan ");
            System.out.println(i + " - " + j + " = " +hsl);
            //Pembagian Pecahan
            //hsl = i/ j;
            float hasil = (float) i / j;
            System.out.print("Pembagian ");
            System.out.println(i + " / " + j + "  = " +hsl);
            //Perkalian
            hsl = i * j;
            System.out.print("Perkalian ");
            System.out.println(i + " * " + j + " = " +hsl);
            //Pembagian
            hsl = i /j; /* pembagian bulat */
            System.out.print("Pembagian ");
            System.out.println(i + " / " + j + " = " +hsl);
            //Modulo
            hsl = i%j; /* sisa modulo */
            System.out.print("Modulo ");
            System.out.println(i + " % " + j + " = " +hsl);
   
            /* operasi numerik */
            System.out.println("===================== OPERASI NUMERIK ====================");
            x = 5; y = 5;
            //Penjumlahan
            res = x + y;
            System.out.print("Penjumlahan ");
            System.out.println(x + " + " + y + " = " + res);
           //Pengurangan
            res = x - y;
            System.out.print("Pengurangan ");
            System.out.println(x + " - " + y + " = " + res);
            //Pembagian  
            res = x / y;
            System.out.print("Pengurangan ");
            System.out.println(x + " / " + y + " = " + res);
           //Perkalian
            res = x * y;
            System.out.print("Pengurangan ");
            System.out.println(x + " * " + y + " = " + res);
   
            /* operasi relasional numerik */
            System.out.println("===================== OPERASI RELATIONAL NUMERIK ====================");
            //Persamaan
            TF = (i==j) ;
            System.out.println(i + " == " + j + " : " + TF);
            //Pertidaksamaan
            TF = (i!=j) ;
            System.out.println(i + " != " + j + " : " + TF);
           //Kurang Dari
            TF = (i < j) ;
            System.out.println(i + " < " + j + " : " + TF);
            //Lebih Dari
            TF = (i > j) ;
            System.out.println(i + " < " + j + " : " + TF);
            //Kurang Dari sama dengan
            TF = (i <= j) ;
            System.out.println(i + " <= " + j + " : " + TF);
            //Lebih Dari sama dengan
            TF = (i >= j) ;
            System.out.println(i + " >= " + j + " : " + TF);
   
            /* operasi relasional numerik */
            System.out.println("===================== OPERASI RELATIONAL NUMERIK ====================");
            TF = (x != y);
            System.out.println(x + " != " + y + " : " + TF);
            TF = (x < y);
            System.out.println(x + " < " + y + " : " + TF);
            TF = (x > y);
            System.out.println(x + " > " + y + " : " + TF);
            TF = (x <= y);
            System.out.println(x + " <= " + y + " : " + TF);
            TF = (x >= y);
            System.out.println(x + " >= " + y + " : " + TF);
   
    }
}
   
       
   
   