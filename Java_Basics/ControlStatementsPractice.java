import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ControlStatementsPractice {
    /// Check even or odd///
    boolean findEvenorOdd(int a)
    {
        if(a%2==0)
            return true;
        return false;
    }
//    Find largest of 3 numbers
    int findlargest(int a, int b, int c)
    {
        if(a>b&&a>c)
            return a;
        else if(b>a&&b>c)
            return b;
        else if(c>a&&c>b)
            return c;

        return -1;
    }
    //Check leap year
    boolean findleapyear(int a)
    {
        if(a%400==0)
            return true;
        return false;
    }
    //Print numbers 1 to 100 for loop testing
    void printnumbers ()
    {
        for(int i=1;i<=100;i++)
            System.out.println(i);
    }
    //Print sum of first N numbers
    void printsumofnumbers(int a)
    {
        int sum=(a*(a+1)/2);
        System.out.println("The sum for 10 numbers is = "+sum);
    }
    //Reverse a number
    void reverseNumbers(int a)
    {
        int ans=0;
        do
        {
            int tem =a%10;
            a=a/10;
            ans=(ans*10)+tem;

        }while(a!=0);
        System.out.println("The reversed number is = "+ans);
    }
    //Count digits in a number
     static void  countdigits(int a)
    {
        int ans =0;
        while(a!=0)
        {
            ans++;
            a=a/10;

        }
        System.out.println("The digits for 10 numbers is = "+ans);
    }

    public static void main (String[]args)
    {
//        System.out.println("Enter the num");
//        Scanner sc = new Scanner(System.in);
//        int num=sc.nextInt();
        ControlStatementsPractice c = new ControlStatementsPractice();
        System.out.println("===============Output for Even and Odd ================================");
        if(c.findEvenorOdd(4))
        System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
        System.out.println("===============Output for largest of 3 numbers=========================");
        System.out.println("The Largest number is = "+c.findlargest(3,4,5));
        System.out.println("===============Output for leap year====================================");
        if(c.findleapyear(2016))
        System.out.println("The Year given is a leap year");
        else
        System.out.println("The year given is not a leap year");
        System.out.println("===============Output for For loop printing 100 numbers ===============");
        c.printnumbers();
        System.out.println("===============Output for sum of n numbers ===============");
        c.printsumofnumbers(10);
        System.out.println("===============Output for Reversing a  numbers ============");
        c.reverseNumbers(12);
        System.out.println("===============Output for count of digit in a numbers ======");
        countdigits(10);
    }
}
