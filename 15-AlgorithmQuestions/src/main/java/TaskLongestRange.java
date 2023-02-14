import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskLongestRange {
    public static void main(String[] args) {
        int[] array={1,11,3,0,15,5,2,4,10,7,12,6};
        System.out.println(Arrays.toString(longestRange(array)));
    }
    public static int[] longestRange(int[]  array) {
        int bestRange[] = new int[2];
        int longest = 0;

        Map<Integer, Boolean> map = new HashMap<>();
        for (int num: array) {
            map.put(num, false); //0(n)
        }
        int left;
        int right;
        for (int num: array) {  //0(n)
            if (map.get(num)) continue;
            map.put(num, true);
            int currentSize = 1;
            left = num--;
            right = num++;
            currentSize++;
            while (map.containsKey(left)) {
                map.put(left, true);
                left--;
                currentSize++;
            }

            while (map.containsKey(right)) {
                map.put(right, true);
                right++;
                currentSize++;
            }
            if (currentSize > longest) {
                longest = currentSize;
                bestRange[0] = left+1;
                bestRange[1] = right-1;
            }

        }

        return bestRange;
    }
}
