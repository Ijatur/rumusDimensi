/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumusdimensi;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RumusDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        String ul="",lagi;
        System.out.println("********** SELAMAT DATANG ***********");
        System.out.println(" ");
        System.out.println("             MENU UTAMA             ");
        System.out.println("1. Luas Persegi Panjang");
        System.out.println("2. Luas Lingkaran");
        System.out.println("3. Luas Segitiga");
        System.out.println("4. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = input.nextInt();
        System.out.println("=====================================");

        switch (pilih) {
            case 1:{
                RumusPersegiPanjang p=new RumusPersegiPanjang();
                p.pp();
                break;
            }
            case 2:{
                RumusLingkaran q=new RumusLingkaran();
                q.LuasLingkaran();
                break;
            }
             case 3:{
               RumusSegitiga r=new RumusSegitiga();
                r.LuasSegitiga();
                break;
             }
            case 4:{
                System.exit(4);
                System.out.println("Warning !! Pilihan tidak tersedia !! ");
            }
                break;
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        }


    }
    
}
