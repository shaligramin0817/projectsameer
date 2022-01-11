import java.util.*;

public class ReverseArrayList {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        //for (int i = 0; i < list.size(); i++)
          //  System.out.print(list.get(i) + " ");
        reverseArrayList(list);

    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        for(int i = list.size()-1;i>=0;i--)
        {
            System.out.print(list.remove(i)+" ");
        }
    }
}