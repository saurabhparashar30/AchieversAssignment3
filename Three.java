package Array;

import java.util.Scanner;


public class Three {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int arr[]=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();    //getting array of size n
        System.out.println("Max sum: "+maxSumContiguous(arr)); //calling function to get sum
    }
    static int maxSumContiguous(int[] a){
        int size = a.length; 
        int max1 = Integer.MIN_VALUE, max2 = 0; 
        
        /*Each time we get a positive sum max2, compare it with max1 
        and update max1 if it is greater than max2*/
        
        for (int i = 0; i < size; i++) 
        { 
            max2 = max2 + a[i]; 
            if (max1 < max2) 
                max1 = max2; 
            if (max2 < 0) 
                max2 = 0; 
        } 
        return max1; 
    }
}
