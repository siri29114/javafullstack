import java.util.*;
public class ZerosAfterOnes 
{
    public static int countZerosAfterOnes(int[] nums)
 {
        int count=0;
        int zeroCount=0;
        for (int i=nums.length-1;i>=0;i--) 
{
            if (nums[i]==0)
 {
                zeroCount++;
            } else if(nums[i]==1)
 {
                count+=zeroCount;
            }
        }
        return count;
    }
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter binary array elements (0 or 1):");
        for (int i = 0;i<n;i++) 
{
            nums[i]=sc.nextInt();
            if (nums[i] != 0 && nums[i] != 1)
 {
                System.out.println("Invalid input: only 0s and 1s allowed.");
                return;
            }
        }
        int result = countZerosAfterOnes(nums);
        System.out.println("Total number of 0s after 1s: " + result);
    }
}