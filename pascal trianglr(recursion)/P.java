/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

import java.util.Scanner;

/**
 *
 * @author Nappy
 */
public class P {

    
    public static void main(String[] args) {
        int result;
        Scanner input=new Scanner(System.in);
        System.out.println("enter values for n and r");
        int n=input.nextInt();
        int r=input.nextInt();
        result=triangle(n,r);
        System.out.println(+ result);
        
    }

    private static int triangle(int n, int r) {
        
        if( n<r || r<0)
        return 0;
      else if ( n==r || r==0)
        return 1;
      else
        return triangle(n-1,r) + triangle (n-1,r-1);
    }
}
