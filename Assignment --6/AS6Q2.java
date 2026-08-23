import java.lang.*;
import java.util.*;
class AS6Q2
{
   public static void main(String args[])
   {
    int i,n;
    Scanner sc=new Scanner(System.in);

    System.out.println("Input the size of the Array");
    n=sc.nextInt();

    int arr[]=new int[n];
    System.out.println("Input the Array");
    for(i=0;i<n;i++){
          arr[i]=sc.nextInt();
   }
int sum=0;
   for(i=0;i<n;i++){
         sum=sum+arr[i];
   }
   int average;
   
   average=sum/n;

   System.out.println("Average of the Array elements = "+average);

   }
}