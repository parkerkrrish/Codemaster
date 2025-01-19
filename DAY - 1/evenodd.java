import java.util.Scanner;
class evenodd
{
    public static void main(String args[])
    {
        int n;
        System.out.print("Enter the number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        if(n%2==0)
        {
            System.out.print("Number is Even!");
        }
        else
        {
            System.out.print("Number is Odd!");
        }
    }
}