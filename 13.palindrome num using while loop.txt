import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
int i=0,n,rev=0,dig,original;
Scanner s=new Scanner(System.in);
System.out.println("enter nth number");
n=s.nextInt();
original=n;
while(i<n)
{
dig=n%10;
rev=rev*10+dig;
n=n/10;
}
System.out.println(rev);
if(original==rev)
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}
