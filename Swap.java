/*10. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively,
write two programs to swap the values of the two variables.
1 - first program by using a third variable.*/
class Swap{
public static void main(String arg[])
  {
   int a=6;
   int b=8;
   int swap=a;
   a=b;
   b=swap;
   
  System.out.println("a value is:"+a);
  System.out.println("b value is:"+b);
  }

}
