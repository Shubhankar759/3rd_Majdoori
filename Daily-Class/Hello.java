import javax.swing.JOptionPane;
public class Hello{
    public static void main (String args[]){
       String total= JOptionPane.showInputDialog(null, args, "enter your marks", 0);
       float n = Float.parseFloat(total);
    
       if(n>=75){
         System.out.println("OP");
    }if(75>=n&&n>=60){
        System.out.println("1st");
       }if(60>=n&&n>=50){
        System.out.println("2nd");
       }if(50>=n&&n>=40){
        System.out.println("3rd");
       }if(40>=n){
        System.out.println("Fail");
       }
        
       
    }
}