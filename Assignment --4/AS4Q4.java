import java.lang.*;
import java.util.*;
class AS4Q4
{
public static void main(String args[])
{
int a,b,c;

Scanner obj=new Scanner(System.in);

System.out.println("Enter value of a");
a=obj.nextInt();

System.out.println("Enter value of b");
b=obj.nextInt();

System.out.println("Enter value of c");
c=obj.nextInt();

obj.close();

if(a>b && a>c){

System.out.println(a+" is greatest number(a)");

}else if(b>a && b>c){

System.out.println(b+" is greatest number(b)");

}else{

System.out.println(c+" is greatest number(c)");

}

}
}