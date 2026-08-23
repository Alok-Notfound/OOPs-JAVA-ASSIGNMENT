import java.lang.*;
import java.util.*;
class AS6Q4
{
   public static void main(String args[])
   {
      int i,j,n;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Input the size of the Array");
      n=sc.nextInt();

      int arr[]= new int[n];

      System.out.println("Input the Array");
      for(i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      
      for(i=0;i<n;i++){
          for(j=i+1;j<n;j++){
              if(arr[i]==arr[j]){
                 System.out.println("Duplicate Element : "+arr[j]);
                 }  
          } 
      }
   }
}