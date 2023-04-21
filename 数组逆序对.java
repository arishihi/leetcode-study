public class 数组逆序对 {
    private int[] tmp;

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        tmp = new int[array.length];
        return mergeSort(array, 0, array.length - 1);
    }

    private int mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (left + right) >> 1;
        int count = mergeSort(array, left, mid) + mergeSort(array, mid + 1, right);
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                tmp[k++] = array[i++];
            } else {
                count += mid - i + 1;
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
                tmp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = array[i++];
        }
        while (j <= right) {
            tmp[k++] = array[j++];
        }
        System.arraycopy(tmp, left, array, left, right - left + 1);
        return count;
    }
}