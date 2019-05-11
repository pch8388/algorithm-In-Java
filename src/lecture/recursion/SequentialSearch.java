package lecture.recursion;

public class SequentialSearch {
    private static int search(int[] data, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int recursionSearch(int[] data, int begin, int end, int target) {
        if (begin > end) return -1;
        else if (target == data[begin]) return begin;
        else return recursionSearch(data, begin+1, end, target);
    }

    public static void main(String[] args) {
        int[] data = {2, 4, 7, 6, 3};
        System.out.println(search(data, 5, 3));
        System.out.println(recursionSearch(data, 0, 4, 3));
    }
}
