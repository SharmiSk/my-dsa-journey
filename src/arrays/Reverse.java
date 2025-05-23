package arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the Array: ");

        int len = sc.nextInt();

        System.out.println("Enter the value of " + len + "element in the array");

        int A[] = new int[len];

        for (int i = 0; i < len; i++) {
            A[i] = sc.nextInt();
        }
        reverse(A);
        for (int i : A) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static void reverse(int[] a) {
        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            swap(a, l, r);
            l++;
            r--;
        }

    }

    public static void swap(int A[], int l, int r) {
        int temp = A[l];
        A[l] = A[r];
        A[r] = temp;


    }
}
