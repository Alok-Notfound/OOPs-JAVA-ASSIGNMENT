import java.lang.*;
import java.util.*;
class AS6Q1
{
   public static void main(String args[])
   {

    int i , j , n;

    Scanner sc=new Scanner(System.in);

    System.out.println("Input the size of the Array");
    n=sc.nextInt();
    
     
    int arr[]=new int[n];
    System.out.println("Input the Array");
    for(i=0;i<n;i++){
         arr[i]=sc.nextInt(); 
    }
    System.out.println(); 
     
    System.out.println("Before Sorting");
    for(i=0;i<n;i++){
          System.out.print(arr[i]+" ");
    }
    System.out.println("\n");
    int temp;
    for(i=0;i<n-1;i++){
          for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 

         }           
    }
    }
    System.out.println("After Sorting");
    for(i=0;i<n;i++){
          System.out.print(arr[i]+" ");
    }
    }
}