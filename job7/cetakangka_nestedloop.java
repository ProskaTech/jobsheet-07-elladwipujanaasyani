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
public class cetakangka_nestedloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        for(int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
