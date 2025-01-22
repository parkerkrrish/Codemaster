import java.util.Scanner;
class gcd {
    public static void main(String[] args) {
        int n1,n2,i,G=0;
        System.out.println("Enter two numbers: ");
        Scanner obj=new Scanner(System.in);
        n1=obj.nextInt();
        n2=obj.nextInt();
        
            for(i=1;i<=n1;i++)
            {
            if(n1%i==0 && n2%i==0)
            G=i;
            }
            System.out.println("GCD will be :"+G);
        
    }
    
}
