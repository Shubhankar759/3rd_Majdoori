import javax.swing.JOptionPane;

public class Adi {
 public static void main(String[] args) {
    int sum=0;
    int n;
    do{
        String sc=JOptionPane.showInputDialog(null, args, "enter number");
          n = Integer.parseInt(sc);
         if(n%2==0){
            sum+=n;
         }


    }while(n!=0);
    System.out.println(sum);
 }   
}
