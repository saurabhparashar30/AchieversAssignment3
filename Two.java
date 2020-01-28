package Array;

import java.util.Scanner;


public class Two {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int arr[]=new int[s1.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();    //input array of size n
        System.out.println("After increment: ");
        incrementBy1(arr);          //calling function to increment
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void incrementBy1(int[] arr){
        
        /*At first increment array's last element by 1, if number becomes 10
        then increment the prevois element bt 1 and make that element 0*/
        
        arr[arr.length-1]+=1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=9 && arr[i]!=10)
                break;
            else{
                arr[i]=0;
                arr[i-1]+=1;
            }
        }
    }
}
