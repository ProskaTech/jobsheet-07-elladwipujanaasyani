// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package job7;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int baris, kolom, hasil_kali;
        int MAKS = 8;
        
        for (baris=1; baris <=MAKS; baris++)
        {
            for (kolom=1; kolom <= MAKS; kolom++)
            {
                hasil_kali = baris*kolom;
                System.out.println("\t" + hasil_kali);
            }
            System.out.println("");
        }
    }
}
