/*10. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively,
write two programs to swap the values of the two variables.
2 - second program without using any third variable.*/
class Swap1{
public static void main(String arg[])
  {
   int a=6;
   int b=8;
   a=a+b;
   b=a-b;
   a=a-b;
  System.out.println("a value is:"+a);
  System.out.println("b value is:"+b);
  }

}
