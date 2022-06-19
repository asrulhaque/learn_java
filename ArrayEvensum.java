//Program to learn basic odd even logic
import java.util.Scanner;

public class ArrayEvensum {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n =sc.nextInt();
        //int[] arr= new int[100];
        int sum =0;

        for(int i=0; i<=50; i++) {

            if (i % 2 == 0) {
                sum += i;
            }
        }


            System.out.println(sum);
    }
}
