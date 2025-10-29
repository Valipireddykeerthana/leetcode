class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n == 0) return 0;

        int[] arr = new int[2 * n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = timeSeries[i];
            arr[i + n] = timeSeries[i] + duration - 1;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + n] < arr[i + 1]) {
                count += duration;
            } else {
                count += arr[i + 1] - arr[i];
            }
        }
        count += duration;

        return count;
    }
}
