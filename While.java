/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg173040011_latihan;


import java.util.Scanner;


public class While {
   /**
    * loop while
    * pengulangan yang diketahui syaratnya
    * tapi tidak dapat doprediksiskan kapan terjadinya
    * kata kunci mengunakan kata selama
    * 
    * secara formatnya :
    * while (syarat){
    * 
    * statement yang berulang
    * }
    * 
    * do{
    * statement yang berulang
    * } while(syarat);
    * 
    * studikasus:
    * buat program yang akan menampilkan hasil inputan keyboard selama nilainya bukan -99
    * 
    * 
    * modulus/ modulo ==>operator mencari sisa bagi
    * genap bagi 2 sisanya 0
    * ganjil bagi 2 sisanya !=0
    * 
    * syaratnya ==> mod 2 ==0
    * 
    */ 
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
      /*  System.out.println("masukan nilai");
        int nilai = sc.nextInt();
        
        while(nilai != -99){
            System.out.println(nilai);
            System.out.println("masukan nilai");
            nilai = sc.nextInt();
                    
        }
        
        do{
            System.out.println(nilai);
            System.out.println("masukan nilai repeat");
            nilai = sc.nextInt();
        } while(nilai != -99);
              */
         System.out.println("masukan nilai");
        int nilai = sc.nextInt();
        
        while(nilai % 2 == 0){
            System.out.println(nilai);
            System.out.println("masukan nilai");
            nilai = sc.nextInt();
                    
        }
        
        do{
            System.out.println(nilai);
            System.out.println("masukan nilai repeat");
            nilai = sc.nextInt();
        } while(nilai % 2 == 0);
        
    }
}
