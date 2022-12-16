import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        printArray(arr);
        reverseArray(arr, 0, arr.length-1);
        System.out.println("Reversed array is ");
        printArray(arr);
    }

    public static void reverseArray(int arr[], int start, int end) {
        int temp;
        if (start >= end) {
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}