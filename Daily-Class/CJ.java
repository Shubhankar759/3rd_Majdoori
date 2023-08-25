import javax.swing.JOptionPane;

public class CJ {
    static void Repeat(String a,int b){
        for(int i=0;i<b;i++){
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, args,"enter char", 0);
        String b = JOptionPane.showInputDialog(null, args,"enter number" , 0);
        int x = Integer.parseInt(b);
        Repeat(a,x);
        
        
    }
}
