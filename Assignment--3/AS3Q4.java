import java.lang.*;
import java.util.*;
class AS3Q4
{
public static void main(String args[])
{
double num;

Scanner obj=new Scanner(System.in);

System.out.println("Enter a number");
num=obj.nextDouble();

obj.close();

if(num>0){
System.out.println(num+" is a positive number");
}
else if(num==0){
System.out.println("The ggiven number is zero");
}
else{
System.out.println(num+" is a negative number");
}
}
}