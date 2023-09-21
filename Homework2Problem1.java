class HelloWorld {
    public static void main(String[] args) {
        int [] theArray = { 1, 1, 2, 2, 1, 2, 1, 2, 1 };
        int majority = MajorityElement(theArray);
        if (majority == -99) {
            System.out.println("There is no majority element");
        }
        else {
            System.out.println("The majority element is " + majority);
        }

    }

    public static int MajorityElement(int [] nums) {
        int count = 0;
        int m = 0;
        for (int i : nums) {
            if (count == 0) {
                m = i;
            }
            if (m == i){
                count++;
            }
            else {
                count--;
            }
        }

        count = 0;

        for (int i : nums) {
            if (m == i) {
                count++;
            }
        }

        if (count > nums.length/2) {
            return m;
        }
        else {
            return -99;
        }
    }
}
