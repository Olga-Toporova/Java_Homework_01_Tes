import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        getCount(getArr(getSize()));
    }

    public static void getCount(int[] arr) {
        int[] newArr = cutArr(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(newArr));
        for (int i = 0; i < newArr.length; i++) {
            int count = 0;
            for (int num : arr) {
                if (newArr[i] == num) {
                    count += 1;
                }
            }
            showCount(newArr[i], count);
        }
    }

    public static void showCount(int num, int count) {
        System.out.println("Число " + num + " встречается " + count + " раз(a)");
    }

    public static int getSize() {
        System.out.println("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.close();
        return size;
    }

    public static int[] getArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10));
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int[] cutArr(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}
