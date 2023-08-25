//WAP to single digit number and print it in words using swtich case

import javax.swing.JOptionPane;

public class kunal {
    public static void main(String[] args) {
        String x=JOptionPane.showInputDialog(null, args, "enter number", 0);
        int n = Integer.parseInt(x);
        switch (n) {
            case 0:System.out.println("zero");break;
            
            case 1:System.out.println("one");break;
            case 2:System.out.println("two");break;
            case 3:System.out.println("three");break;
            case 4:System.out.println("four");break;
            case 5:System.out.println("five");break;
            case 6:System.out.println("six");break;
            case 7:System.out.println("seven");break;
            case 8:System.out.println("eight");break;
            case 9:System.out.println("nine");break;
            
        
            default:System.out.println("invalid");
                break;
        }

    }
}
