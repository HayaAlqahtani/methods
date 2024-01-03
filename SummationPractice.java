import java.util.ArrayList;
import java.util.List;

public class SummationPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(16);
        nums.add(32);

        System.out.println(sub(nums));
    }

    public static int sub(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Main []";
    }
}