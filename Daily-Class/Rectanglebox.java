class shubhankar{
    public static void main(String[] args) {
        Rectanglebox S1 = new Rectanglebox();
        S1.setData(10,12);
        S1.ketan();
        Rectanglebox S2 = new Rectanglebox();
        S2.setData(15, 15);
        S2.ketan();
    }
}

public class Rectanglebox {
    int a,c;
    public void setData(int l,int b){
       a=l;
       c=b;
    }
    public void ketan(){
        int aera = 2*(a+c);
        if(a==c){
            System.out.println("This is a Square"+aera);
        }else{
            System.out.println("The rectangle parameter is"+aera);
        }
    }
}

