import java.lang.*;
import java.util.*;
class AS4Q1
{
public static void main(String args[])
{
double a,b,c,d,value1,value2;

Scanner obj=new Scanner(System.in);

System.out.println("Enter the value of a");
a=obj.nextDouble();

System.out.println("Enter the value of b");
b=obj.nextDouble();

System.out.println("Enter the value of c");
c=obj.nextDouble();

obj.close();

d=(b*b)-(4*a*c);

if (d>0){

value1=(-b + Math.sqrt(d)) / (2*a);
value2=(-b - Math.sqrt(d)) / (2*a);

System.out.printf("Value1= %.2f\n",value1);
System.out.printf("Value2= %.2f\n",value2);

}else if(d==0){

value1=-b/(2*a);
value2=-b/(2*a);

System.out.printf("Value1= %.2f\n",value1);
System.out.printf("Value2= %.2f\n",value2);

}else{

System.out.println("Roots are imaginary");
}

}
}