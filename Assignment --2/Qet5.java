import java.lang.*;
class Qet5
{
public static void main(String args[])
{
int years,days,minutes,totaldays;
minutes=529920;

totaldays=minutes/1440;
years=totaldays/365;
days=totaldays%365;

System.out.println(years+ "year and " +days+ "days");
}
}