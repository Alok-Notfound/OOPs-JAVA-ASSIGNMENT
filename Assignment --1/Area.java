import java.lang.*;
class Area
{
public static void main(String args[])
{
double a=5,b=3,c=7,s,area;

s=(a+b+c)/2;

area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of the given triangle is "+area);
}
}