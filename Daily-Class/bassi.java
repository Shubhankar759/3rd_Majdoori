// WAP to use func  star to print star before and after name
import javax.swing.JOptionPane;

public class bassi {
    static void Star(int n){
        for(int i=0;i<=n;i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        String y = JOptionPane.showInputDialog(null, args, "enter number", 0);
        int z = Integer.parseInt(y);
        Star(z);
        System.out.println("");
        System.out.println("bassi");
        Star(z);
    }
}
