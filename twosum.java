import java.util.Scanner;
import java.util.Arrays;

class twosum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                } 
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size_arr = scanner.nextInt();
        int[] nums = new int[size_arr];
        System.out.print("Enter" +size_arr+ "arrays: ");
        for (int i = 0; i<size_arr; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter target: ");
        int target = scanner.nextInt();
        twosum obj = new twosum();
        int[] result = obj.twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No results found!");
        }
        else {
            System.out.println("Indices: " +Arrays.toString(result));
        }
        scanner.close();
    }
}