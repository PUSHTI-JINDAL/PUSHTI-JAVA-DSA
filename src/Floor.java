import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter array elements ");
        for(int i=0;i<arr.length;i++){
           arr[i] =sc.nextInt();
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    // FLOOR MEANS TO FIND GREATEST NUMBER LESS THAN OR EQUAL TO THE TARGET.
   static  int floor(int[]arr,int target){
       if (target < arr[0]) {
           return -1; // No floor exists
       }
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
       // At this point, end is the index of the greatest element <= target
        return arr[end];
   }
}
