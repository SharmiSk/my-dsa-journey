package arrays;

/*Write a program to read 5 integers from the user,
 store them in an array, and print all the elements of the array.*/

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int arr[] = new int[5];

       for (int i = 0; i < 5; i++){
           System.out.println("Enter the value at " + i+ "index: ");
arr[i] = sc.nextInt();


       }
       sc.close();
for (int i : arr){
    System.out.println(i + " ");
}
    }
}
