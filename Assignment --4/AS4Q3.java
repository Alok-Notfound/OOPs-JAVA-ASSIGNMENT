import java.lang.*;
import java.util.*;
class AS4Q3
{
public static void main(String args[])
{
int days,months;

Scanner obj=new Scanner(System.in);

System.out.println("Enter no. of months");
months=obj.nextInt();

obj.close();

days=months*30;

System.out.println("NO. of days= "+days);
}
}