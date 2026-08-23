import java.lang.*;
import java.util.*;
class AS6Q5
{
   public static void main(String args[])
   {
      int i,j,n1,n2,n3=0;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Input the size of the 1st Array");
      n1=sc.nextInt();

      System.out.println("Input the size of the 2nd Array");
      n2=sc.nextInt();


      String arr1[]= new String[n1];
      String arr2[]= new String[n2];

      System.out.println("Input the 1st Array");
      for(i=0;i<n1;i++){
          arr1[i]=sc.next();
      }

      System.out.println();

      System.out.println("Input the 2nd Array");
      for(i=0;i<n2;i++){
          arr2[i]=sc.next();
      }
      
      for(i=0;i<n1;i++){
          for(j=0;j<n2;j++){
              if(arr1[i] .equals (arr2[j])){
                 n3++;
                 break;
              }
          } 
      }
 
      String arr3[]= new String[n3];
      int k=0;

      for(i=0;i<n1;i++){
          for(j=0;j<n2;j++){
              if(arr1[i] .equals (arr2[j])){
                 arr3[k]=arr1[i];
                 k++;
                 break;
              }
          } 
      }
     System.out.print("Common Element : [");
     for(i=0;i<n3;i++){
         System.out.print(" "+arr3[i]);
         if(i<n3-1){
            System.out.print(",");   
         }
     }
     System.out.print(" ]");
   }
}