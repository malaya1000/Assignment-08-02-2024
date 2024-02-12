/*13.Write a program to calculate the sum of the first and the second
last digit of a 5 digit.
E.g.- NUMBER : 12345 OUTPUT : 1+4=5.*/

class Sumofdigit{
  public static void main(String arg[])
    {
   int remf=0;
   int reml=0;
   int num=56395;
     for(int i=0;i<2;i++)
       {
        reml=num%10;
        num/=10;
        }
     while(num!=0)
       {
        remf=num%10;
        num/=10;
       }
   int sum=remf+reml;
 System.out.println("Sum of the first and the second last digit of a 5 digit :"+sum);
   }
}