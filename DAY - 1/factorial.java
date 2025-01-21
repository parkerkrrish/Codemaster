import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
        int n,i,factorial=1;
        System.out.println("Enter the number: ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
    
}
