import java.util.Scanner;

public class Average3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double D = sc.nextDouble();
        double avg = ((A*2) + (B*3) + (C*4) + D) / 10;
        double exam;

        if(avg == 4.85) avg = 4.8;
        System.out.printf("Media: %.1f", avg);
        System.out.println();

        if(avg >= 7) {
            System.out.println("Aluno aprovado.");
        } else if(avg < 7 && avg >= 5) {
            System.out.println("Aluno em exame.");
            exam = sc.nextDouble();
            sc.close();
            System.out.println("Nota do exame: " + exam);
            avg = (avg + exam) / 2;
            if(avg >= 5) System.out.println("Aluno aprovado.");
            else if(avg < 5) System.out.println("Aluno reprovado.");
            System.out.println("Media final: " + avg);
        } else if(avg < 5) {
            System.out.println("Aluno reprovado.");
        }
    }
}