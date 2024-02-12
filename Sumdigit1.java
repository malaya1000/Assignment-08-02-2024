/*15.Write a program to calculate the sum of the digits of a 3-digit
number.
Number : 132 Output : 6*/

import java.util.Scanner;
class Sumdigit1{
  public static void main(String arg[])
    {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the 3 digit number:");
   int num=sc.nextInt();
   int rem1=0;
       while(num!=0)
       {
        int rem=num%10;
       
           rem1=rem1+rem;
             num=num/10;
        }
        
           
       
  System.out.println("Number is :"+rem1);
   }
}