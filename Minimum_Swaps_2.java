import java.io.*;
import java.util.*;
public class x
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt()-1;
        }
        int c=0;
        int t;
        int flag=0;
        while (flag==0)
        {
        for (int i=0;i<n;i++)
        {
            if (arr[i]!=i)
            {
                t=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=t;
                c++;
            }
        }
        flag=1;
        for (int i=0;i<n;i++)
        {
            if (i<(n-1))
            {
                if (arr[i]<arr[i+1])
                {
                    continue;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
        }
        }
        System.out.println(c);
    }
}
