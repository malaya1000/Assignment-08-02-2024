/*Assign values of variables 'a' and 'b' as 55 and 70 respectively and
then check if both the conditions 'a < 50' and 'a < b' are true.*/
class Compare1{
public static void main(String arg[])
  {
    int a=55;
    int b=70;
    if(a<50 && a<b)
       {
    System.out.println("Condition is true.");
      }

     else{
        System.out.println("Condition is false.");
         }
         
   }
}

//o/p: Condition is false.