import java.util.ArrayList;
import java.util.HashMap;

public class task2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 2, 1, 1, 3, 4, 5, 3, 3, 6, 7, 8};
        
        int[] result = removeFrequentNumbers(A);
        
        System.out.print("New massive: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeFrequentNumbers(int[] A) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num : A) {
            if (frequencyMap.get(num) <= 3) {
                resultList.add(num);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
    

