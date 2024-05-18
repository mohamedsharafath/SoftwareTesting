import java.util.*;
class Calculator{
    void add(int a,int b)
    {
        System.out.println(a+b);
        return;
    }
    void sub(int a,int b)
    {
        System.out.println(a-b);
        return;
    }
    void mul(int a,int b)
    {
        System.out.println(a*b);
        return;
    }
    void div(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Can't able to perform this operation.");
            return;
        }
        System.out.println(a/b);
        return;
    }
}
public class cc_023_q6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Calculator cal=new Calculator();
        while(true)
        {
            System.out.println("Enter the 1st number: ");
            int n1=sc.nextInt();
            System.out.println("Enter the 2nd number: ");
            int n2=sc.nextInt();
            System.out.println("Enter the operation to be performed: ");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            int opt=sc.nextInt();
            System.out.println("Answer:");
            switch (opt) {
                case 1:
                    cal.add(n1,n2);
                    break;
                case 2:
                    cal.sub(n1,n2);
                    break;
                case 3:
                    cal.mul(n1,n2);
                    break;
                case 4:
                    cal.div(n1,n2);
                    break;
                
                default:
                    break;
            }
            System.out.println("press 1 to continue or 0 to terminate");
            int c=sc.nextInt();
            if(c==0)
            {
                break;
            }
    }

    }
}
