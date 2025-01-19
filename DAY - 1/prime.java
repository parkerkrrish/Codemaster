import java.util.Scanner;
class prime {
    public static void main(String args[])
    {
        int i,n,count=1;
        System.out.println("Enter any Nunber:");
        Scanner obj=new Scanner (System.in);
        n=obj.nextInt();
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
        
            }
        }
        if(count==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.print("not prime");
        }
        
    
    }
    
}
