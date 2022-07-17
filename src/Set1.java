import java.util.Arrays;
import java.util.HashSet;

public class Set1 {
    public static void main(String[] args){
        // 1. 자바에서 집합 사용 - HashSet
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1);
        System.out.println("set1 = " + set1);
        System.out.println(set1.size());
        System.out.println("set1.contains(2) = " + set1.contains(2));


        // 2. 집합 연산
        // 2-1. 교집합
        HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5));
        HashSet b = new HashSet(Arrays.asList(2, 4, 6, 8 ,10));
        a.retainAll(b); // 교집합 계산되어 교집합 변수만 남음 2, 4


        // 2-2. 합집합
        a.addAll(b);

        // 2-3. 차집합
        a.removeAll(b);
    }
}
