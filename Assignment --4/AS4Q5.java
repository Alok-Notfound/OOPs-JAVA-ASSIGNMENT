import java.lang.*;
import java.util.*;
class AS4Q5
{
public static void main(String args[])
{
char ch;

Scanner obj=new Scanner(System.in);

System.out.println("Enter a character");
ch=obj.next().charAt(0);

obj.close();

if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
   ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){

System.out.println("The entered character is Vowel");

}else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){

System.out.println("The entered character is Consonanent");

}else{

System.out.println("Not  a chatracter");

}

}
}