//Wap print week days by using switch case
import javax.swing.JOptionPane;

public class weekdays {
    public static void main(String[] args) {
        String sc = JOptionPane.showInputDialog(null, args, "enter number", 0);
        int x = Integer.parseInt(sc);
        switch (x) {
            
            case 0:System.out.println("Sun");break;
            case 1:System.out.println("Mon");break;
            case 2:System.out.println("Tue");break;
            case 3:System.out.println("Wed");break;
            case 4:System.out.println("Thur");break;
            case 5:System.out.println("Fri");break;
            case 6:System.out.println("Sat");break;

        
            default:System.out.println("input number between 0 to 6");
                break;
        }
    }
}
