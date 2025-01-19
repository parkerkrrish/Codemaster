import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        int n,a=0,b=1,c;
        System.out.println("Enter the limit:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(int i=1;i<n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        
    }
    
}
