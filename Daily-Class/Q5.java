// WAP print number divisble to n by number 1 to n
import javax.swing.JOptionPane;
public class Q5 {
    public static void main(String[] args) {
        int x=1;
        String i= JOptionPane.showInputDialog(null, args, null, x);
        int n = Integer.parseInt(i);
        while(x<=n){
            if(n%x==0){
                System.out.println(x);
            }
            x++;
        }
    }
}
