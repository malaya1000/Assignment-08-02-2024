/*14.Take a 4 digit number. Write a program to display a number whose
digits are 2 greater than the corresponding digits of the number
TAKEN.
For example, if the number which was taken is 5696, then the
displayed number should be 7818*/
import java.util.Scanner;
class Shifttwonum{
  public static void main(String arg[])
    {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the 5 digit number:");
   int num=sc.nextInt();
   int rem1=0;
   int num1=0;
   int num2=0;
     while(num!=0)
       {
        int rem=num%10;
        rem=rem+2;
        if(rem==11)
          {
           rem=1;

           }
           else if(rem==10)
           {
            rem=0;
           }
            else
              {
              rem=rem;
               }
           num1=num1*10+rem;
             num=num/10;
        }
        while(num1!=0)
           {
         int rem3=num1%10;

          num2=num2*10+rem3;
          num1=num1/10;
           }
           
       
  System.out.println("Number is :"+num2);
   }
}