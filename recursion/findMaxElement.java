//You are given an array with n number of elements. You have to print the maximum of an array using a recursion function.
// Sample Input: 5,8,6, 9, 1, 2
// Sample Output: 9

import java.io.*;
import java.util.*;
class temp{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements in arr");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers.");
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int ans = findMax(arr,0);
        System.out.println(ans);
    }

    public static int findMax(int[] arr,int i ) {

        if(i==arr.length){
            return 0;
        }

        int max=findMax(arr,i+1);
        if(arr[i]>max){
            max=arr[i];
        }
        return max;
    }
}
