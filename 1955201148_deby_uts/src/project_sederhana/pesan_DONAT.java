/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_sederhana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class pesan_DONAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int  pilih; 
        String nama;
        System.out.print("Masukkan nama :");
        nama = input.next();
        System.out.print("Menu pilihan: \n[1].donat cokelat \n[2].donat keju \n[3].donat kentang \n[4].donat mesis \nMasukkan pilihan :");
   
        pilih = input.nextInt();
     
        System.out.println("================");
        
        Scanner scan = new Scanner(System.in);
        
        switch(pilih){       
                
            case 1 : 
                System.out.println("Nama pemesan :"+nama);
                System.out.println("Pesanan : donat cokelat");
                System.out.println("Harga  : 2500");
               boolean running = true;
            String jawab;
            
            int counter = 0;
            
          while (running) {
              System.out.println("apakah anda ingin memesan donat cokelat lagi ?");
              System.out.println("jawab [ya / tidak]");
              
              jawab = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab.equalsIgnoreCase("tidak") ){
            running = false;
        }
        counter++;
          }  
                System.out.println("anda sudah pesan donat " + counter + " biji");
        
               
                break;
            case 2 :
                System.out.println("Nama pemesan :"+nama);
                System.out.println("Pesanan : donat keju");
                System.out.println("Harga  : 3.000");
                 boolean donat = true;
            String jawab1;
            
            int counter1 = 0;
            
          while (donat) {
              System.out.println("apakah anda ingin memesan donat keju lagi ?");
              System.out.println("jawab [ya / tidak]");
              
              jawab1 = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab1.equalsIgnoreCase("tidak") ){
            donat = false;
        }
        counter1++;
          }  
                System.out.println("anda sudah pesan donat " + counter1 + " biji");
       
                break;
            case 3 :
                System.out.println("Nama pemesan :"+nama);
                System.out.println("Pesanan : donat kentang");
                System.out.println("Harga  : 4.000"); 
                boolean running2 = true;
            String jawab2;
          
            int counter2 = 0;
            
          while (running2) {
              System.out.println("apakah anda ingin memesan donat kentang lagi ?");
              System.out.println("jawab [ya / tidak]");
              
              jawab2 = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab2.equalsIgnoreCase("tidak") ){
            running2 = false;
        }
        counter2++;
          }  
                System.out.println("anda sudah pesan donat " + counter2 + " biji");
        
            break;
            
            case 4 :
                System.out.println("Nama pemesan :"+nama);
                System.out.println("Pesanan : donat misis");
                System.out.println("Harga  : 2.000"); 
                boolean running3 = true;
            String jawab3;
          
            int counter3 = 0;
            
          while (running3) {
              System.out.println("apakah anda ingin memesan donat kentang lagi ?");
              System.out.println("jawab [ya / tidak]");
              
              jawab3 = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab3.equalsIgnoreCase("tidak") ){
            running3 = false;
        }
        counter3++;
          }  
                System.out.println("anda sudah pesan misis " + counter3 + " biji");
        
            break;
            
            default:
            System.out.println("Maaf Anda Salah Pilih Menu ! :(");
            
           
    }    
}

}    
    

