
package hearrates;

import java.util.Scanner;
public class Heart {
    public static void main(String[] arg){
        Scanner input =new Scanner(System.in);
        
        System.out.println("enter your first name: ");
        String first=input.nextLine();
        
        System.out.println("enter your last name: ");
        String last=input.nextLine();
        
        System.out.println("enter your date of birth: ");
        int date=input.nextInt();
        
        HeartRates now=new HeartRates(first,last,date);
        
        System.out.printf("your first name is %s\nYour last name is %s\nYour date of birth %d\n",now.getfirstname(),now.getlastname(),now.getdatebirth());
           System.out.println();
                  
        int one=now.age(date);
        int two=now.HR(one);
        double three=now.THR((double)two);
        double four = now.THR1((double)two);
        System.out.printf(" Your age is %d\n you heart beat is %d\n your target heart rate is b/w %.2f-%.2f\n",one,two,three,four);
    }
}
