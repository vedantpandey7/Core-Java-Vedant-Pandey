import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3, 1, 2, 2, 2, 5, 4};

        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>(); 

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

       
        List<Integer> sortedList = new ArrayList<>();
        for (int num : arr) {
            if (!sortedList.contains(num)) {
                sortedList.add(num);
            }
        }
        sortedList.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a)); 
            return (freqCompare != 0) ? freqCompare : 0; 
        });

        
        System.out.println("Elements sorted by decreasing frequency:");
        for (int num : sortedList) {
            for (int i = 0; i < frequencyMap.get(num); i++) {
                System.out.print(num + " ");
            }
        }
    }
}
