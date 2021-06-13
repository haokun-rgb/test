public class findOne {
    public static int findNum(int[] array) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i]; // 异或运算
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,5,1,2,3,2,4,8,8,4,5};
        System.out.println(findNum(array));
    }
}