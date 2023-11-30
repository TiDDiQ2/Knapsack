import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    public static final int SIZE = 15;
    public int n;
    public int weightMax;
    public MyPair[] objects = new MyPair[SIZE];

    public int[][] getDynamicArray() {
        int[][] arr = new int[n + 1][weightMax + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= weightMax; j++) {
                if (objects[i - 1].getWeight() <= j) {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - objects[i - 1].getWeight()] + objects[i - 1].getValue());
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        return arr;
    }

    public int answer(int[][] arr) {
        return arr[arr.length - 1][arr[0].length - 1];
    }

    public String backtrack(int[][] arr) {
        int w = arr[0].length - 1;
        int i = arr.length - 1;
        boolean[] picked = new boolean[i];
        for (int j = 0; j < i; j++) {
            picked[j] = false;
        }
        while (i > 0 && w > 0) {
            if (arr[i][w] != arr[i - 1][w]) {
                picked[i - 1] = true;
                w -= objects[i - 1].getWeight();
            }
            i--;
        }
        String itemsToPick = "";
        for (int j = 0; j < arr.length - 1; j++) {
            if(picked[j]) {
                itemsToPick += (j+1) + ", ";
            }
        }
        return itemsToPick;
    }
}