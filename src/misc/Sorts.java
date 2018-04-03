package misc;

public class Sorts {
    public static int[] merge(int[] arr) {
        return mergeHelper(arr, 0, arr.length);
    }

    private static int[] mergeHelper(int[] arr, int start, int end) {
        int length = end - start;

        if (length == 0)
            return new int[]{};

        if (length == 1)
            return new int[]{arr[start]};

        int midpoint = length / 2;
        int[] front = mergeHelper(arr, start, start + midpoint);
        int[] back = mergeHelper(arr, start + midpoint, end);

        int[] out = new int[length];

        int outIndex = 0;
        int frontIndex = 0;
        int backIndex = 0;
        while (frontIndex < midpoint && backIndex < length - midpoint) {
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
        for (; frontIndex < midpoint; frontIndex++) {
            out[outIndex] = front[frontIndex];
            outIndex++;
        }
        for (; backIndex < length - midpoint; backIndex++) {
            out[outIndex] = back[backIndex];
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
