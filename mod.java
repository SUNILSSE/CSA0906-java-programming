import java.io.*;
import java.util.*;
class p
{
void display()
{
System.out.println("parent");
}}
class c extends p
{
void display()
{
System.out.println("child");
}}
class mod
{
public static void main(String args[])
{
c a=new c();
a.display();
p b=new p();
b.display();
}
}
