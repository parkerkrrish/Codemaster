import java.util.Scanner;
class armstrong {
    public static void main(String args[])
    {
        int n,r,sum=0;
        System.out.println("Enter any number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int m=n;
        while(n>=1)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(m==sum)
        {
            System.out.print("It is an Armstrong number...!");
        }
        else
        {
            System.out.print("It is not an Armstrong number...!");
        }
    }
    
}
