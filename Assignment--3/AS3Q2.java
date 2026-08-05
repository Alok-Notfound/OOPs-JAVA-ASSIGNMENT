import java.lang.*;
import java.util.*;
class AS3Q2
{
public static void main(String args[])
{
double bs,hra,da,gs;

Scanner obj=new Scanner(System.in);

System.out.println("Enter Basic Sallery");
bs=obj.nextDouble();

obj.close();

hra=bs*0.1;
da=bs*0.6;

gs=bs+hra+da;

System.out.println("Gross Sallery= "+gs);
}
}