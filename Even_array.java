import java.util.*;
public class Even_array
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[] =new int[n];
            int odd=0;
            int even=0;
            int count=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2==0)
                even++;
                else
                odd++;
            }
            if((n%2!=0&&even!=(odd+1))||(n%2==0&&even!=odd))
            {
                System.out.println(-1);
            }
           
           else
           {

            for(int i=0;i<n;i++)
            {
                if(i%2==0&&a[i]%2!=0)
                count++;
                if(i%2!=0&&a[i]%2==0)
                count++;
            }
            System.out.println(count/2);
        }
        }
    }
}