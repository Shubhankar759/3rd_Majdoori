import javax.swing.JOptionPane;
public class Grading{
    public static void main (String args[]){
       String total= JOptionPane.showInputDialog(null, args, "enter your marks", 0);
       float n = Float.parseFloat(total);
    
       if(n>=75){
         System.out.println("DT");
    }else if(75>=n&&n>=60){
        System.out.println("1st");
       }else if(60>=n&&n>=50){
        System.out.println("2nd");
       }else if(50>=n&&n>=40){
        System.out.println("3rd");
       }else if(40>=n){
        System.out.println("Fail");
       }
        
       
    }
}