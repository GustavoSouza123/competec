import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, m1, h2, m2, hrs, mins;
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        hrs = 0;
        mins = 0;
        while(!(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0)) {
            if(h1 < h2) {
                hrs = h2 - h1;
                if(m1 < m2) {
                    mins = m2 - m1;
                } else if(m1 == m2) {
                    mins = 0;
                } else if(m1 > m2) {
                    mins = 60 - (m1 - m2);
                    hrs--;
                }
            } else if(h1 == h2) {
                if(m1 < m2) {
                    mins = m2 - m1;
                    hrs = 0;
                } else if(m1 == m2) {
                    mins = 0;
                    hrs = 0;
                } else if(m1 > m2) {
                    mins = 60 - (m1 - m2);
                    hrs = 23;
                }
            } else if(h1 > h2) {
                if(m1 < m2) {
                    mins = m2 - m1;
                    hrs = 24 - (h1 - h2);
                } else if(m1 == m2) {
                    mins = 0;
                    hrs = 24 - (h1 - h2);
                } else if(m1 > m2) {
                    mins = (60-m1) + m2;
                    hrs = 23 - (h1 - h2);
                }
            }

            mins += (hrs*60);
            System.out.println(mins);

            h1 = sc.nextInt();
            m1 = sc.nextInt();
            h2 = sc.nextInt();
            m2 = sc.nextInt();
            hrs = 0;
            mins = 0;
        }

        sc.close();
    }
}