//1. Length and breadth of a rectangle are 5 and 7 respectively. Write program to calculate the area and perimeter of the rectangle.
import java.util.Scanner;
public class Rectangle{

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of rctangle");
int l=sc.nextInt();
Scanner s=new Scanner(System.in);
System.out.println("Enter the width of rctangle");
int w=s.nextInt();
int area=l*w;
int peri=(l+w)*200;
System.out.println("Area of a rectangle is :"+area);
System.out.println("Perimeter of a rectangle is :"+peri);
}
}

 
