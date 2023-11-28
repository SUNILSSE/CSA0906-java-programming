import java.io.*;
import java.util.*;
class diamond
{
public static void main(String args[])
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.println("enter n:");
n=s.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<i+1;j++)
{
System.out.print("1");
}
System.out.println("\n");
}
for (i = 1; i < n; i++) 
        {
            for (j = i; j < n; j++)
{
               System.out.print("1");
}
          System.out.print("\n");
}
}
}
