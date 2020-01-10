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
public class RumusSegitiga {
    public void LuasSegitiga(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Alas : ");
        double f = input.nextInt();
        System.out.print("Masukan Tinggi : ");
        double g = input.nextInt();
        double y = (f * g) / 2;
        System.out.println("==========================");
        System.out.println("");
        System.out.println("Luas Segitiga = " + y);
}
}
