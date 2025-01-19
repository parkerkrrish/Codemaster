import java.util.Scanner;
class leapyear {
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter any year:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        if(n%400==0 && n%100==0 || n%4==0 && n%100!=0)
        {
            System.out.println("Leap year!");
        }
        else
        {
            System.out.println("Not a leap year!");
        }
    }
    
}
