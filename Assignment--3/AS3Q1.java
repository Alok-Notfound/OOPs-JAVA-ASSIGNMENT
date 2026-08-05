import java.lang.*;
import java.util.*;
class AS3Q1
{
public static void main(String args[])
{
double sub1,sub2,sub3,sub4,sub5;

Scanner obj=new Scanner(System.in);

System.out.println("Enter first subject marks");
sub1=obj.nextDouble();

System.out.println("Enter second subject marks");
sub2=obj.nextDouble();

System.out.println("Enter third subject marks");
sub3=obj.nextDouble();

System.out.println("Enter fourth subject marks");
sub4=obj.nextDouble();

System.out.println("Enter fifth subject marks");
sub5=obj.nextDouble();

obj.close();

double total,per;

total=sub1+sub2+sub3+sub4+sub5;

per=total/5;

System.out.println("Total maarks is "+total);
System.out.println("Total percentage is "+per);
}
}