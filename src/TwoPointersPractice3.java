public class TwoPointersPractice3 {
    public static String solution(String s){
        if (s == null){
            return null;
        }

        if (s.length() < 2 ){
            return s;
        }

        s = removeSpace(s);
        char[] cArr = s.toCharArray();
        reverseString(cArr, 0, s.length() - 1);
        reverseWords(cArr, s.length());

        return new String(cArr);
    }

    public static String removeSpace(String s){
        int p1 = 0;
        int p2 = 0;

        char[] cArr = s.toCharArray();
        int length = s.length();

        while(p2 < length){
            while (p2 < length && cArr[p2] == ' ') {
                p2++;
            }
            while(p2 < length && cArr[p2] != ' '){
                cArr[p1++] = cArr[p2++];
            }
            while(p2 < length && cArr[p2] == ' '){
                p2++;
            }
            if(p2 < length){
                cArr[p1++] = ' ';
            }
        }
        return new String(cArr).substring(0, p1);
    }

    public static void reverseString(char[] cArr, int i, int j){
        while(i < j){
            char tmp = cArr[i];
            cArr[i++] = cArr[j];
            cArr[j--] = tmp;
        }
    }

    public static void reverseWords(char[] cArr, int length){
        int p1 = 0;
        int p2 = 0;

        while(p1 < length){
            while (p1 < p2 || p1 < length && cArr[p1] == ' '){
                p1 ++;
            }
            while (p2 < p1 || p2 < length && cArr[p2] != ' '){
                p2 ++;
            }
            reverseString(cArr, p1, p2 - 1);
        }
    }

    public static void main(String[] args){

    }
}
