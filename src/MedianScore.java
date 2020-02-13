import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianScore {
    public static void main(String[] args) {

        int[] scores = {100, 20, 50, 70, 45};
        List<Integer> storageOfScore = new ArrayList<>();
        int[] medianScores = new int[scores.length];
        try {
            for (int i = 0; i < scores.length; i++) {
                storageOfScore.add(scores[i]);
                Collections.sort(storageOfScore);
                int median = findMiddleElement(storageOfScore.stream().mapToInt(e->e).toArray());
                medianScores[i] = median;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(Arrays.toString(medianScores));
    }

    public static int findMiddleElement(int[] nums) {
        int median;
        if (nums.length % 2 == 0) {
            median = (nums[(nums.length / 2) - 1] + nums[nums.length / 2])/2;;
        } else {
            median = nums[nums.length / 2];
        }
        return median;
    }

}