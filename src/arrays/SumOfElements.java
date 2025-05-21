package arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Enter the element of "+ i + "index: ");
           num[i]= sc.nextInt();
        }
        int sum =0;
        for (int i : num){
           sum +=i;
        }
        System.out.println("sum of all elements: "+ sum);
sc.close();
    }
}
