// 分解质因数

public class resolve {
    public static void main(String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("请输入正整数:");
        int num = input.nextInt();
        String s = String.valueOf(num);
        s += "=";

        for (int i = 2;i <= num;i++) {
            if (num % i == 0) {
                num = num / i;
                s = s + i + "*";
            }
        }

        s = s.substring(0,s.length()-1);
        System.out.println(s);
    }
}