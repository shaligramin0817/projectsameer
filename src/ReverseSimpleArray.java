import java.util.*;

public class ReverseSimpleArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);

    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {
        // Write your code here
        for(int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
