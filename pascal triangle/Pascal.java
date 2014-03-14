/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal;

import java.util.Scanner;

public class Pascal {

   
    public static void main(String[] args) {
        
        Scanner get = new Scanner(System.in);
        System.out.println("Enter your limit: ");
        int n=get.nextInt();
        //System.out.printf("%d", comb(n,3));
         System.out.printf("1\t");
        for(int i=0;i<n;i++){
          int j=i+1;
             
          
            for(int s=1; s<=j; s++ ){
                
                System.out.printf("%d\t",comb(j,s));
               
                
            }
           System.out.println("\b");
          System.out.printf("1\t");
        }
        
  }
    
    private static int fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    
    public static int comb(int n,int r){
          return (fact(n))/(fact(r)*fact(n-r));
    }
}
