import java.util.*;
public class AccurateLee
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();        
            String regex1 = "11";
            String regex2="01";
         
           while(s.contains(regex2)||s.contains(regex1))
           {
              s=s.replace(regex1, "0");
              s=s.replace(regex2, "1");
              
              
           }
           
            System.out.println(s);
  
        }
    }
}