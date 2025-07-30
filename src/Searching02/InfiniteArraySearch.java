package Searching02;

import java.util.Scanner;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
     int []arr={2,3,4,5,6,7,8};
     int target=sc.nextInt();
        System.out.println(findRange(arr,target));
    }
   static int findRange(int[]arr,int target){
        int start=0;
        int end=1;
        while(end < arr.length && target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
            // Cap the end to the last index if it exceeds the array size
            if (end >= arr.length) {
                end = arr.length - 1;
            }
        }
        return binarySearch(arr,target,start,end);
    }
   static int binarySearch(int[]arr,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return-1;
    }
}
