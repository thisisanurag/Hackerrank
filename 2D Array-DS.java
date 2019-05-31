import java.io.*;
import java.util.*;
public class x
{
    public static void main(String args[])
    {
        long a[][]=new long [6][6];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<6;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        long lg=-999;
        long sm,s=0;
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<6;j++)
            {
                if (i+1<6 && i+2<6 && j+1<6 && j+2<6)
                {
                    s=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                    if (s>lg)
                    {
                        lg=s;
                    }
                }
            }
        }
        System.out.println(lg);
    }
}
