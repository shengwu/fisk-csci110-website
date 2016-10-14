
/**
 * The following class contains several compilation errors. Please
 * fix them and describe the errors in comments near where you
 * found the errors.
 */
public class One {

    static void printIfGreater(int i, int limit) {
        if (i > limit) {
            System.out.println(i + " is greater than " + limit);
        }
    }

    public static void main(String[] args) {
        double[] nums = {5.6, 1.0, 8.8, 2.5, 2.0, 10.432, 12.4, 98.2, 1.2, 91.2};

        for (i = 0; i < nums.length; i++) {
            nums[i] = Math.pow(nums[i], 2);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.sqrt(nums[i], 2);
        }

        for (int j < 0; j < nums.length; j++) {
            if (j < 4) {
                nums[j] -= 1.0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 5) {
                nums[j] += 2.0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] =* 2;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] =/ 2;
        }

        for (int i = 1; i < nums.length; i++) {
            printIfGreater(nums[i], nums[i-1]);
        }

    }
}
