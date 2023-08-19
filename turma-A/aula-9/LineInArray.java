import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int L = sc.nextInt();
        char T = sc.next().charAt(0);
        float sum = 0;

        float[][] M = new float[12][12];
        for(i = 0; i < 12; i++) {
            for(j = 0; j < 12; j++) {
                M[i][j] = sc.nextFloat();
                if(i == L) {
                    sum += M[i][j];
                }
            }
        }

        if(T == 'M') {
            sum /= 12;
        }
        System.out.printf("%.1f", sum);
        System.out.println();
    }
}