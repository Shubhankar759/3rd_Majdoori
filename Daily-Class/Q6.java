import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
    int y=0;
    int i;
        Scanner n = new Scanner(System.in);
       int x = n.nextInt();
       while(x!=0){
         i = n.nextInt();
         if(i>0){
            y+=i;
         }
         x--;
       }
       System.out.println(y); 

    }
}
