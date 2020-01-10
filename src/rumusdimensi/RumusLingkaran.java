/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumusdimensi;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class RumusLingkaran {
     public void LuasLingkaran(){
    double f,y;
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Masukan jari-jari : ");
        f = input.nextInt();
        y = 22 / 7*f*f;
        System.out.println("======================================");
        System.out.println("Luas Lingkaran = " + y);
    }
}
