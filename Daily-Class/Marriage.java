import javax.swing.JOptionPane;
public class Marriage {
    public static void main(String args[]){
        String G = JOptionPane.showInputDialog(null, args, "enter gender", 0); 
        String A = JOptionPane.showInputDialog(null, args, "enter age", 0);
        int n = Integer.parseInt(A);
        if(G=="female"){
            System.out.println("yes you can marry");
        }else{
            System.out.println("not you can't");
        }
        
    }
}
