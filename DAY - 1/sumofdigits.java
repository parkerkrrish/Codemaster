import java.util.Scanner;

class sumofdigits {
    public static void main(String[] args) {
        int n,sum=0,r;
        System.out.println("Enter any number: ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        while(n>=1)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
