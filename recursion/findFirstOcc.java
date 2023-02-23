//You are given an array of integers of length n and an integer 
//that is to be searched for it first occurrence in the array. 
//You are required to print the index of the first occurrence 
//of an element in the array else print -1.
// Sample Input: 5 3, 6, 3, 4, 5 3
// Sample Output: 1

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
        System.out.println("Enter the Key");
        int key = scn.nextInt();
        int ans = findFirstOcc(arr,0,key);
        System.out.println(ans); //print the index
        scn.close();
    }

    public static int findFirstOcc(int[] arr,int i,int key) {
        if(i==arr.length ){
            return 0;
        }

        if(key == arr[i]){
            return i;
        }
        int ans = findFirstOcc(arr,i+1,key);
        return ans;
    }
}
