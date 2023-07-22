
package data_atlet;

import java.util.Scanner;
        
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //array untuk menyimpan objek AtletPencakSilatKota
        AtletPencakSIlatKota[] atletArray = new AtletPencakSIlatKota[2];
        
        System.out.println("--------------------------------------------");
        System.out.println("Program Pendataan Atlet Pencak Silat KALSEL ");
        System.out.println("--------------------------------------------");
        
        //pendataan atlet menggunakan perulangan for
        for (int i= 0; i < atletArray.length; i++){
            System.out.println("\nData Atlet " + (i + 1));
            System.out.println("Nama: ");
            String Nama = input.nextLine();
            
         //error handling untuk nama tidak boleh kosong
         while(Nama.trim().isEmpty()){
             System.out.println("Nama tidak boleh kosong. SIlahkan masukkan nama atlet.");
             System.out.println("nama: ");
             Nama = input.nextLine();
         }
         
            System.out.println("Usia: ");
            int usia = Integer.parseInt(input.nextLine());
            System.out.println("Kota: ");
            String kota = input.nextLine();
            
            //membuat objek AtletPencakSIlatKota menggunakan construktor
            atletArray[i] = new AtletPencakSIlatKota(Nama, usia, kota);
        }
        
        //menampilkan data atlet menggunakan perulangan for each
        System.out.println("\nData Atlet Pencak Silat");
        for (AtletPencakSIlatKota atlet : atletArray){
            atlet.displayInfo();
               
        //seleksi usia atlet
        if (atlet.getUsia() >= 20){
            System.out.println("Kategori: Senior");
        }else{
            System.out.println("Kategori: Junior");
        }
        System.out.println();
        }
    input.close(); 
}
}

