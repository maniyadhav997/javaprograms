import java.io.*;
import java.util.*;
class Bubblesort
{
public static void binarysearch()
{
int[] b=new int[]{1,2,3,4};
int a=4,i,mid,low=0,high=4,k;
System.out.println("enter value to be search");
Scanner sc=new Scanner(System.in);
k=sc.nextInt();
for(i=0;i<=4;i++)
{
mid=(low+high)/2;
if(k<b[mid])
high=mid-1;
else if(k>=b[mid])
low=mid+1;
else if(k==b[mid])
System.out.println("element is found");
else
System.out.println("element is not found");
}
}
}
public class Bubblesortp{
public static void main(String[]args)
{
Bubblesort c=new Bubblesort();
c.binarysearch();
}
}