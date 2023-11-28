import java.io.*;
import java.util.*;
class hollowsq
{
public static void main(String args[])
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.println("enter n:");
n=s.nextInt();
for(i=0;i<n;i++)
{
for(j=0; j<n; j++)
{
if(i == 0 || i == n-1 || j == 0 || j == n-1)
{
System.out.print("*"+" ");
}
else
{
System.out.print(" "+" ");
}
}
System.out.println();
}
}
}
