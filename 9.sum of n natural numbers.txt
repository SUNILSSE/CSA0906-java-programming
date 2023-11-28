import java.io.*;
import java.util.*;
class sumnatural
{
public static void main(String args[])
{
int i=0,sum=0,n;
Scanner s=new Scanner(System.in);
System.out.println("enter nth number:");
n=s.nextInt();
do
{
i=i+1;
sum=sum+i;
}
while(i<n);
System.out.println(sum);
}
}
