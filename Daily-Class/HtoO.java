//WAP to print 100 to 1 divisible by 2 and 5 using while loop
public class HtoO {
    public static void main(String[] args) {
        int x=100;
        while (x!=0) {
            if(x%2==0||x%5==0){
                System.out.println(x);
            }
            x--;
        }
    }
}
