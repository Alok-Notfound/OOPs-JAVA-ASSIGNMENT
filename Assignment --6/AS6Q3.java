import java.lang.*;
import java.util.*;
class AS6Q3
{
   public static void main(String args[])
   {
    int n,i;
    
    System.out.println("Input the size of the Array");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
  
   int arr[]=new int[n];
   System.out.println("Input the values between 1 to 100");
   for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
   }
   int max=0;
   int min=100;
   for(i=0;i<n;i++){
         if(arr[i]>=max){
            max=arr[i];
         }
         if(arr[i]<min){
            min=arr[i];
         }
   }
 
   System.out.println("Maximum value for the above Array= "+max);
   System.out.println("Minimum value for the above Array= "+min);

   }
}