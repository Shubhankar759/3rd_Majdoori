import java.util.Scanner;
public class fib {
    public static void main(String args[]){
       int a=0;
       int b=1;
       int sum=0;
       System.out.println("Enter number to find fibonaaci number");
       Scanner n = new Scanner(System.in);
       int x = n.nextInt();
       System.out.println(a);
       System.out.println(b);
       while(x!=0){
        sum=a+b;
        System.out.println(sum);
        a=b;
        b=sum;
        x--;
       }

    } 
    
}
