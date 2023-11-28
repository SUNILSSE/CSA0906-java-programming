import java.io.*;
import java.util.*;
class display
{
public static void main(String args[])
{
int x[]=new int[10];
int i,n;
Scanner s=new Scanner(System.in);
System.out.println("enter n");
n=s.nextInt();
for(i=1;i<n;i++)
{
x[i]=s.nextInt();
}
System.out.println("output");

for(i=1;i<n;i++)
{
System.out.println(x[i]);
}
}}
