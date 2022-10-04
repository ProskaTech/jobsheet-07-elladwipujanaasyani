// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package job7;

import java.util.Scanner;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class cetaknama {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan nama : ");
        String nama = in.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(i +". "+ nama);
        }
    }
}
