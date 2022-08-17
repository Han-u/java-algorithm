public class TwoPointersPractice1 {
    public static String solution(String s){
        if (s == null || s.length() == 0){
            return null;
        }

        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2 && s.charAt(p1) == s.charAt(p2)){
            char c = s.charAt(p2);

            while(p1 <= p2 && s.charAt(p1) == c){
                p1++;
            }

            while(p1 <= p2 && s.charAt(p2) == c){
                p2--;
            }
        }

        return s.substring(p1, p2 + 1);
    }
    public static void main(String[] args){
        System.out.println(solution("ab"));
        System.out.println(solution("aaabbaa"));
        System.out.println(solution("aabcddba"));
    }
}
