import java.util.Scanner;
public class Homework5 {
    int gcd(int m,int n){
        while(n!=0){
            int temp=n;
            n=m%n;
            m=temp;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Homework5 homework5 =new Homework5();
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(homework5.gcd(m,n));
       
         sc.close();
        
    }
   
}
