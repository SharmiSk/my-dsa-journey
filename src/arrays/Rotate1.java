package arrays;

import java.util.Scanner;

public class Rotate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' to rotate right and '0' to rotate left");
        int dir = sc.nextInt();
        System.out.println("Enter Number of Rotations: ");
        int x = sc.nextInt();

        int A[] ={1,2,3,4,5,6,7,8};
        int len = A.length;
        int B[] = new int[len];

        if(dir == 1) {
            for (int i = 0; i < len; i++) {
                B[(i + x) % len] = A[i];
            }
        }else{
                for (int i = 0; i < len; i++){
                    B[(i - x + len)%len]= A[i];
            }
        }

     for (int i : A){
         System.out.print(i + " ");
     }
        System.out.println();

     for (int i : B){
         System.out.print(i + " ");
     }

    }
}
