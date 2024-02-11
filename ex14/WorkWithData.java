package ex14;

public class WorkWithData {
    public static void main(String[] args) {
        Integer[] nums = new Integer[15];
        int min = -20;
        int max = 20;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) ((Math.random() * (max - min)) + min);
        }
        for (Integer num : nums) {
            System.out.println(num);
        }
        int maxInt = 0;
        int minInt = 0;
        for (int j = 1; j < nums.length; j++) {
            maxInt = Math.max(maxInt, nums[j - 1]);
        }
        for (int j = 1; j < nums.length; j++) {
            minInt = Math.min(minInt, nums[j - 1]);
        }
        System.out.println("Минимальное значение в массиве = " + minInt);
        System.out.println("Максимальное значение в массиве = " + maxInt);
        System.out.print("Наибольшее значение по модулю из минимального и максимального чисел = ");
        System.out.println(Math.abs(minInt) > Math.abs(maxInt) ? minInt : maxInt);
    }
}
