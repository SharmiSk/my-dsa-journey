package arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int num[] = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Enter element at index " + i + ": ");
            num[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : num) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != Integer.MIN_VALUE) {
                secondLargest = n;

            }
        }
            if(secondLargest == Integer.MIN_VALUE){
                System.out.println("there is no second largest element all elememts are equal");
            }else{
                System.out.println("Second Largest  Number is "+secondLargest);
            }
        }


}
