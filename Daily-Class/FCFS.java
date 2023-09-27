import java.util.Scanner;

public class FCFS {
    public static void avg (int[] a,int i){
       int n,sum=0,avg;
       for(n=0;n<i;n++){
        sum+=a[n];
       }
       avg=sum/i;
       System.out.println("Average is "+avg);


    } 

    public static void bubble(int i,int[] at,int[] bt) {
		int temp,n,j;
		for(n=0;n<i;n++) {
			for(j=1;j<(i-n);j++) {
				if(at[j-1]>at[j]) {
					temp = at[j-1];  
                    at[j-1] = at[j];  
                    at[j] = temp;
                    temp = bt[j-1];  
                    bt[j-1] = bt[j];  
                    bt[j] = temp;  
				}
			}
		}
	}

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int i;
	  
	  System.out.println("Enter number of process");
	  i = sc.nextInt();
	  
	 int[] bt=new int[10];
	 int[] at=new int[10];
	 int n;
	 for(n=1;n<=i;n++) {
		 System.out.println("Process no."+n);
		 System.out.println("Enter Burst time");
		 bt[n-1]=sc.nextInt();
		 System.out.println("Enter Arrival time");
		 at[n-1]=sc.nextInt();
		 
}
	 bubble(i,at,bt);
for(n=1;n<=i;n++) {
	System.out.println("Process Arrived "+n+" Burst time:"+bt[n-1]+" Arrival time:"+at[n-1]);
}
int[] tat = new int[10];
int[] wt = new int[10]; 
int sum=0;
  for(n=0;n<i;n++) {
	  if(n==0){ tat[n]=bt[n]-at[n]; } 
     
 else{ tat[n]=bt[n]-at[n]+bt[n-1]+sum;
       sum+=bt[n-1];}

     System.out.println("Turn around time of "+(n+1)+" is "+tat[n]);
  }
  avg(tat,i);
  for(n=0;n<i;n++){
       if(n==0){ wt[n]=at[n];}

       else{ wt[n]=tat[n]-bt[n]; }

       System.out.println("Waiting time 0f "+(n+1)+" is "+wt[n]);
  }
  avg(wt, i);
  sc.close();
  }
}