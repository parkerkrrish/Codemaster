import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
         int n,r,Rev=0;
         System.out.println("Enter any number: ");
         Scanner obj=new Scanner(System.in);
         n=obj.nextInt();
         int m=n;
         while(n>=1)
         {
            r=n%10;
            Rev=(Rev*10)+r;
            n=n/10;
         }
         if(m==Rev)
         {
            System.out.println("It is Palindrome number...!");
         }
         else
         {
            System.out.println("It is not a Palindrome number...!");
         }
    }
    
}
