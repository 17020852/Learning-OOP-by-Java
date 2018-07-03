/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author PC
 */
public class VariableDemo {

    /**
     * @param args the command line arguments
     */
    static int x,y;
    public static void main(String[] args) {
        // TODO code application logic here
        x = 10;
        y = 20;
        int z = x+ y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = x + y = " + z);
        System.out.println("Number lower is: " + Math.min(x, y));
        char c = 80;
        System.out.println("Character is: " + c);
        int n = 0;
        try {
            BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
            String s;
            s = in.readLine();
            n = Integer.parseInt(s);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Input error !");
        }
        System.out.println("This is: " + n);
        int arrInt[] = new int[10];
        int i;
        int j;
        int ct = 0;
        int kt = 0;
        try (Scanner inp = new Scanner(System.in)) {
            for (i=0; i<10; i = i +1) {
                arrInt[i] = inp.nextInt();
            }
        }
        for (i =1; i<10; i = i + 1) {
           for (j=0; j<i; j++)
           {
               if ( arrInt[j] == arrInt[i] ) {
                   ct = i;
                   kt = 1;
                   break;
               }
           }
           if (kt == 1) break;
        }
        if (kt == 1) 
            System.out.println("Number is : " + arrInt[ct]);
        else System.out.println(-1);
        
    }
   
}
