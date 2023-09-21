import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int [] nums = {3,6,9,1};

        System.out.println("The maximum gap is " + MaximumGap(nums));
    }

    public static int MaximumGap(int [] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int min = nums[0], max = nums[0];
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int bucketSize = (int) Math.ceil((double) (max - min) / (nums.length - 1));

        int [] minBucket = new int[nums.length];
        int [] maxBucket = new int[nums.length];

        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        for (int i : nums) {
            int index = (i - min) / bucketSize;
            if (i < minBucket[index]) {
                minBucket[index] = i;
            }
            if (i > maxBucket[index]) {
                maxBucket[index] = i;
            }
        }

        int gap = bucketSize;
        int compare = maxBucket[0];

        for (int i = 0; i < nums.length; i++) {
            if (minBucket[i] != Integer.MAX_VALUE) {
                if (minBucket[i] - compare > gap) {
                    gap = minBucket[i] - compare;
                }
                compare = maxBucket[i];
            }
        }

        return gap;
    }

}
