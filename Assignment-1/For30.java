public class For30 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};

        for (int i = 0; i < num.length;i++){
            for(int j = 0; j < num.length;j++){
                System.out.println(num[i] + " " + num[j]);
            }
        }
    }
}
