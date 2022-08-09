import java.util.ArrayList;
import java.util.HashMap;

/*
문자열배열을 anagram으로 묶어서 출력
 */
public class SortPractice2 {
    public static ArrayList<ArrayList<String>> solution(String[] strs){
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            char[] cArr = s.toCharArray();
            sort(cArr);
            String key = String.valueOf(cArr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void sort(char[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    char tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution(strs));

        strs = new String[]{"abc", "bac", "bca", "xyz", "zyx", "aaa"};
        System.out.println(solution(strs));
    }
}
