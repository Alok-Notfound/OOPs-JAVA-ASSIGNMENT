import java.lang.*;
import java.util.*;
class AS4Q2
{
public static void main(String args[])
{
double n1,n2;

Scanner obj=new Scanner(System.in);

System.out.println("Input first floating point number");
n1=obj.nextDouble();

System.out.println("Input Second floating point number");
n2=obj.nextDouble();


obj.close();

if(Math.round(n1*1000) == Math.round(n2*1000)){

System.out.println("They are same upto 3 decimal places");

}
else{

System.out.println("They ar not");

}
}
}