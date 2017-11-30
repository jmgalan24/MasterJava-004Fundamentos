/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice;

/**
 *
 * @author jgalan2015
 */
public class ArrayTest {
    static int[] arrayNumeros;
    
    public static void main (String[] args){
        arrayNumeros = new int[5];
        
        //Otra forma de declarar e iniciar directamente:
        int [] array2 = {2,3,4,5};
        
        for (int is : array2){
            System.out.println(is);
        }
                
        // Arrays bidimensionales
        int[][] bidi = new int[3][4];
        
        // Puedo decir las dimensiones en los dos sitios
        int[] nombre[] = new int [2][3];
        nombre[0][0] = 0; //También nombre[0] = new int[]{1,2,3};
        nombre[1][0] = 9; //
        
        
    }
}
