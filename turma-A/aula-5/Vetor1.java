public class Vetor1 {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3};
        int soma = 0;
        for(int i = 0; i < nums.length; i++) soma += nums[i];
        System.out.println(soma);
    }
}