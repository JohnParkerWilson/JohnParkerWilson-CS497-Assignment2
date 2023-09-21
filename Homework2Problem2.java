import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int [] theArray = { 9, 4, 5, 8, 6, 4, 7};
        int k = 3;

        System.out.println(k + "th Largest Element is " + KthLargestElement(theArray, 0, theArray.length - 1, k));
    }

    public static int KthLargestElement(int [] nums, int low, int high, int k) {
        int part = partition(nums, low, high);

        if (part == k - 1){
            return nums[part];
        }
        else if (part < k - 1) {
            return KthLargestElement(nums, part + 1, high, k);
        }
        else {
            return KthLargestElement(nums, low, part - 1, k);
        }

    }

    public static int partition(int [] nums, int low, int high) {
        int pivot = nums[high];
        int pivotPoint = low;
        for (int i = low; i <= high;i++) {
            if (nums[i] > pivot) {
                int x = nums[i];
                nums[i] = nums[pivotPoint];
                nums[pivotPoint] = x;
                pivotPoint++;
            }
        }

        int x = nums[high];
        nums[high] = nums[pivotPoint];
        nums[pivotPoint] = x;

        return pivotPoint;
    }
}
