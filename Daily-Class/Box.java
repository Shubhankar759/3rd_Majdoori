

 class ketan {
  public static void main(String[] args) {
    Box B1= new Box();
    Box B2=new Box();
    B1.setdata(5, 10, 15);
    B1.vol();
    B2.setdata(5,6,10);
    B2.vol();
  }
    
}

public class Box {
 int l,h,b;
 public void setdata(int a ,int c,int d){
    l=a;
    h=c;
    b=d;

 }public void vol(){
    int vol = l*b*h;
    System.out.println("The vol is "+vol+"m^2");
 }
 
    
}
