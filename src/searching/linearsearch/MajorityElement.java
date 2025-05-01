package searching.linearsearch;

class MajorityElement {
   static public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;  // choose a new candidate
            }

            if (num == candidate) {
                count++;  // gain confidence
            } else {
                count--;  // lose confidence
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        majorityElement(new int[]{2,2,1,1,1,2,2,2});
    }
}
