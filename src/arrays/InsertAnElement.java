package arrays;

import java.util.Scanner;

public class InsertAnElement {
    /*🔧 Purpose:
    This method inserts a new element (ele) at a given position (pos) in the array
     A, and shifts the rest of the elements to the right to make space.
      It returns the new size after insertion.
     */



    public static void main(String[] args) {

        int cap = takeInput("Enter the capacity of the Array: ");
        int size = takeInput("Enter the Size:");

        int arr[] = new int[cap];

       for(int i = 0; i < size;i++){
           arr[i] = takeInput("Enter the Element at "+ i+"index: ");
       }

      int ele = takeInput("Enter the element: ");
       int pos = takeInput("Enter the position: ");

       size = insert(arr,pos,ele,size);
       for (int i : arr){
           System.out.print(i + " ");
       }

    }

    private static  int insert(int arr[],int pos,int ele, int size){
        for (int i = size;  i > pos; i-- ){
            arr[i] = arr[i -1];
        }

        arr[pos] = ele;
        size++;

        return size;
    }
    private static int takeInput(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println(s);
        int input = sc.nextInt();
        return input;
    }
}
