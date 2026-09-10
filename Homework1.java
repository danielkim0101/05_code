import java.util.Scanner;

public class Homework1 {
    
    public static void main(String[] args) { // Import the Scanner class to read input
        Scanner sc = new Scanner(System.in); // Create a Scanner object 
        int arr[] = new int[5]; // Create an array to store 5 integers
        int sum = 0; // Initialize a variable to store the sum of the integers

        for (int i = 0; i < 5; i++) { 
            System.out.print("정수를입력하세요: "); 
            arr[i] = sc.nextInt(); // Read the integer input
            sum=sum+arr[i];
            System.out.println("입력된 정수의 합은 " + sum + "입니다");
        }
       
        
    }
    
}
