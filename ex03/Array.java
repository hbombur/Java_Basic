package ex03;

public class Array {
    public static void main(String[] args) {
        int tmp;
        int[] numArray = new int[5];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 6);
        }
        tmp = numArray[0];
        numArray[0] = numArray[numArray.length - 1];
        numArray[numArray.length - 1] = tmp;
        System.out.print(numArray[0] + numArray[numArray.length / 2]);
    }
}
