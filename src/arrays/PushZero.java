package arrays;

import java.util.Scanner;

public class PushZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the Array: ");

        int len = sc.nextInt();
        System.out.print("Enter the value of " + len + " elements in the Array: ");
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        push(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void push(int[] A) {
        int nz = 0;
        int z = 0;

        while (z < A.length) {
            if (A[z] != 0) {
                swap(A, z, nz);
                nz++;

            }
            z++;
        }
    }

    private static void swap(int[] arr, int z, int nz) {
        int temp = arr[z];
        arr[z] = arr[nz];
        arr[nz] = temp;


    }
}
