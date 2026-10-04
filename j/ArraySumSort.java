import java.util.Arrays;
import java.util.Scanner;

class ArraySumSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        Arrays.sort(a);

        System.out.println("Sum = " + sum);

        System.out.println("Elements in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
