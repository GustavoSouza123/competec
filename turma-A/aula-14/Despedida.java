import java.util.Scanner;

public class Despedida {
    public static void main(String[] args) {
        // Dividing X by Y
        /*Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double X, Y, result;
        while(N > 0) {
            X = sc.nextInt();
            Y = sc.nextInt();
            if(Y == 0) {
                System.out.println("divisao impossivel");
                N--;
                continue;
            }
            result = X / Y;
            System.out.printf("%.1f", result);
            System.out.println();
            N--;
        }*/

        // Array Replacement I
        /*Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        for(int i = 0; i < 10; i++) {
            X[i] = sc.nextInt();
            if(X[i] <= 0) {
                X[i] = 1;
            }
            System.out.println("X["+ i +"] = "+X[i]);
        }*/

        // One-Two-Three
        /*Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String word;
        while(N > 0) {
            word = "";
            word = sc.nextLine();
            if(word.length() == 3) {
                if(word.indexOf("t") == 0) {
                    if(word.indexOf("w") == 1 || word.indexOf("o") == 2 || word.contains("oo")) {
                        System.out.println(2);
                    } else {
                        System.out.println(1);
                    }
                } else if(word.indexOf("w") == 1) {
                    if(word.indexOf("t") == 0 || word.indexOf("o")== 2 || word.contains("ww")) {
                        System.out.println(2);
                    } else {
                        System.out.println(1);
                    }
                } else if(word.indexOf("w") == 0) {
                    if(word.contains("ww")) {
                        System.out.println(2);
                    } else {
                        System.out.println(1);
                    }
                } else if(word.indexOf("o") == 2) {
                    if(word.indexOf("t") == 0 || word.indexOf("w")== 1) {
                        System.out.println(2);
                    } else {
                        System.out.println(1);
                    }
                } else {
                    System.out.println(1);
                }
            } else {
                System.out.println(3);
            }
            N--;
        }*/

        // Logical Sequence 2
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 1; i <= y; i++) {
            System.out.print(i);
            if(i % x == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}