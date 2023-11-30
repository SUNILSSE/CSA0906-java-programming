import java.io.*;
import java.util.*;
class s10
{
public static void main(String args[])
{
int i,j,x=4;
for(i=0;i<x;i++){
int n=1;
System.out.print("%"+(x-i)*2+"s"+"");
for(j=0;j<=i;j++){
System.out.println("%4d"+n);
n=n*(i-j)/(j+=1);
}
System.out.println();
}
}
}
