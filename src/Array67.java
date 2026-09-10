import java.util.Scanner;
class Array67 {
    double array1[]= {1.1, 2.3, 4.7, 7.5};
    double array2[]= new double[4];
    public static void main(String[] args) {
    for(int i=0;i<4;i++){
        array2[i]=array1[i];
    }
    System.out.println("array1의 값"+java.util.Arrays.toString(array1));
    System.out.println("array2의 값"+java.util.Arrays.toString(array2));
    }

} 