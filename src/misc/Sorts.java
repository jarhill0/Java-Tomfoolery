package misc;

public class Sorts {
    public static int[] merge(int[] arr) {
        if (arr.length < 2)
            return arr;

        int midpoint = arr.length / 2;
        int[] front = merge(slice(arr, 0, midpoint));
        int[] back = merge(slice(arr, midpoint, arr.length));

        int[] out = new int[arr.length];

        int outIndex = 0;
        int frontIndex = 0;
        int backIndex = 0;
        while (frontIndex < front.length && backIndex < back.length) {
            if (front[frontIndex] < back[backIndex]) {
                out[outIndex] = front[frontIndex];
                frontIndex++;
            } else {
                out[outIndex] = back[backIndex];
                backIndex++;
            }
            outIndex++;
        }

        // exited loop because front or back has "run out" of elements; remaining array is known to be sorted.
        for (; frontIndex < front.length; frontIndex++) {
            out[outIndex] = front[frontIndex];
            outIndex++;
        }
        for (; backIndex < back.length; backIndex++) {
            out[outIndex] = back[backIndex];
            outIndex++;
        }
        return out;
    }

    // slice an array, like in Python (arr[2:5])
    private static int[] slice(int[] arr, int start, int end) {
        int[] out = new int[end - start];

        int outIndex = 0;

        for (int i = start; i < end; i++) {
            out[outIndex] = arr[i];
            outIndex++;
        }
        return out;
    }

    private static String arrToString(int[] arr) {
        String s = "{";
        for (int num : arr)
            s += num + ", ";
        return s.substring(0, s.length() - 2) + "}";
    }

    public static void main(String[] args) {
        System.out.println(arrToString(merge(new int[]{5, 2, 5, 7, 23, 34, 6, 2, 4, 6})));
    }

}
