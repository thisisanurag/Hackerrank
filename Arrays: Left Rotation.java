import java.io.*;
import java.util.*;
public class x
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,a;
        n=sc.nextInt();
        a=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=a%n;
        for(int i=k;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
