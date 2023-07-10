import java.util.*;

class Multiplication extends Thread {
    public void run() {
        System.out.println("\n\nMULTIPLICATION TABLE OF 5\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}

class Prime extends Thread {
    public void run() {
        int count = 0, i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter value for N :");
        n = sc.nextInt();
        System.out.println("Prime Numbers are :");
        for(int j=2;j<=n;j++)
        {
        count=0;
        for(i=1;i<=j;i++)
        {
           if(j%i==0)
           {
                count++;        
           }
        }
        if(count==2)
               System.out.print(j+"  ");     
        }
        }
    }

class Multiprime {
    public static void main(String args[]) {
        Multiplication m = new Multiplication();
        m.start();
        Prime p = new Prime();
        p.start();
    }
}