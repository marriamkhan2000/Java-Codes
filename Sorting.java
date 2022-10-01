public class Sorting {
    public static void main(String[] args) {
        int[] nums={7,2,3,1,9,0,12,41};
        for (int i = 0; i < nums.length; i++)
        {for (int j = i + 1; j < nums.length; j++)
            {int arr;
                if (nums[i] > nums[j])
                {arr= nums[i];
                    nums[i] = nums[j];
                    nums[j] = arr;}}}
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);}}}
