public class Logarithm {
    public static void main(String[] args){
        // 1. 제곱, 제곱근, 지수
        System.out.println("== 제곱 ==");
        System.out.println(Math.pow(2, 3)); // 8
        System.out.println(Math.pow(2, -3)); //0.125
        System.out.println(Math.pow(-2, -3)); //-0.125

        System.out.println(Math.pow(2, 30)); // 1.073741824E9
        System.out.printf("%.0f\n", Math.pow(2, 30)); //1073741824

        System.out.println("== 제곱근 ==");
        System.out.println(Math.sqrt(16)); // 4
        System.out.println(Math.pow(16, 1.0/2)); //4
        System.out.println(Math.pow(16, 1.0/4)); //2


        // 절대 값
        System.out.println("== 절대값 ==");
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));


        // 2. 로그
        System.out.println("== 로그 ==");
        System.out.println(Math.E);
        System.out.println(Math.log(2.718281828459045)); // 1
        System.out.println(Math.log10(1000)); // 3
        System.out.println(Math.log(4) / Math.log(2)); // log2 4
    }
}
