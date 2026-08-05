import java.lang.*;
import java.util.*;
class AS3Q5
{
public static void main(String args[]){

double buy,sell,lp,pp,diff;

Scanner obj=new Scanner(System.in);

System.out.println("Enter buy price");
buy=obj.nextDouble();

System.out.println("Enter sell price");
sell=obj.nextDouble();

obj.close();

if(buy==sell){
System.out.println("There is no profit & loss");
}
else if(buy>sell){
diff=buy-sell;
lp=diff*100/buy;
System.out.printf("Loss Percentage=%.2f%%",lp);
}
else{
diff=sell-buy;
pp=diff*100/buy;
System.out.printf("Ptofit Percentage=%.2f%%",pp);
}
}
}
