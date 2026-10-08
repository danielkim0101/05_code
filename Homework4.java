import java.util.Scanner;

class Homework4 {
    
    int gcd(int m, int n){
        if (n==0)
            return m;
        else return gcd(n, m%n);
        }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("두 수를 입력하세요:");
        int m= scanner.nextInt();
        int n= scanner.nextInt();
        

        Homework4 homework4= new Homework4();
        int result= homework4.gcd(m,n);
        System.out.printf("두 수의 최대공약수는 %d입니다\n",result);
    }
}
