package arrays;

import java.util.Scanner;

public class updateAnElement {

    private  static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int input=sc.nextInt();
        return  input;
    }


    public static void main(String[] args) {
        int cap = takeInput("Enter the capacity of the Array: ");

        int A[] = new int[cap];

        for (int i = 0; i < cap;i++){
            A[i] = takeInput("Enter the element of "+ i + "index :");
        }
        int key = takeInput("Enter the Key");
        int newKey = takeInput("Enter the newKey");

        update(A,key,newKey);
        for (int i : A){
            System.out.print(i + " ");

        }

    }

    private static void update(int[] a, int key, int newKey) {
        for (int i =0; i < a.length -1 ;i++){
        if(a[i] == key){
            a[i] = newKey;
            return;
        }

        }
        System.out.println("Key is not found in the Array");
    }
}
