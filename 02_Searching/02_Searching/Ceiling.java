import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    int[]arr={2,3,4,7,8,11};
    int target;
    System.out.println("enter target element");
    target=sc.nextInt();
    int ans=ceiling(arr,target);
        System.out.println(ans);

    }
    static int ceiling (int[]arr,int target){
        if (target > arr[arr.length - 1]) {
            return -1; // No ceiling exists
        }
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
