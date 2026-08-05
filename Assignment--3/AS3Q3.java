import java.lang.*;
import java.util.*;
class AS3Q3
{
public static void main(String args[])
{
double e,pr,cr,cost=0;

Scanner obj=new Scanner(System.in);

System.out.println("Enter previous consumption");
pr=obj.nextDouble();
System.out.println("Enter current consumption");
cr=obj.nextDouble();

obj.close();

e=cr-pr;

if(e<=100){
cost=3*e;
}
else if(e<=500){
cost=(100*3)+(e-100)*4;
}
else{
cost=(100*3)+(400*4)+(e-500)*6;
}

System.out.println("Total electricity cost= "+cost);
}
}