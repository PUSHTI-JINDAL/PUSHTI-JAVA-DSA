import java.util.Arrays;
import java.util.Scanner;

public class FirstLastIndex {
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
        System.out.println(Arrays.toString(index(arr,target)));
    }
    static int [] index(int[]arr,int target){
        int []ans={-1,-1};
         ans[0] =FindIndex(arr,target,true);
         ans[1]=FindIndex(arr,target,false);
        return ans;
    }

   static int FindIndex(int[]arr,int target, boolean FirstIndex){
        int ans =-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
            else {//(target==arr[mid])//MORE SAME NUMBERS CAN LIE TO THE LEFT AND RIGHT SO WE ARE USING BS AGAIN.
                ans=mid;//THIS CAN BE A POSSIBLE ANSWER.
                if(FirstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
