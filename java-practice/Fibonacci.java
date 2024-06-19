import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of terms to be displayed");
        int prev=1;
        int next=1;
        int temp;  
        int n=sc.nextInt();
        System.out.println(");
        System.out.println("1");
        for(int i=3;i<=n;i++)
        {
            temp=next;
            next=prev+next;
            System.out.println(next);
            prev=temp;
        }
        

}
}
