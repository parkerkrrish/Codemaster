import java.util.Scanner;

class lcm {
    public static void main(String[] args) {
        int i,n1,n2;
        System.out.println("Enter two numbers: ");
        Scanner obj=new Scanner(System.in);
        n1=obj.nextInt();
        n2=obj.nextInt();
        for(i=n1;i<=n1*n2;i++)
        {
            if(i%n1==0 && i%n2==0)
            {
                System.out.println("LCM of the numbers will be: "+i);
                break;
            }
        }
                
    }   
    
}
