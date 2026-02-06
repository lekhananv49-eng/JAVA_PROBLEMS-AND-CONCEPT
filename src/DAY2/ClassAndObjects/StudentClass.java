package DAY2.ClassAndObjects;

import java.util.Scanner;

class Student {
    int rollno;
    int m1, m2, m3;

    Student(int rollno, int m1, int m2, int m3) {
        this.rollno = rollno;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int totalMarks() {
        return m1 + m2 + m3;
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student[] s = new Student[50];
        // int[] value = new int[80]; // 60
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of Students: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i + 1) + " Marks");
            int rollno = sc.nextInt();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            s[i] = new Student(rollno, m1, m2, m3);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].totalMarks());
        }

        int max1, max2, max3, r1, r2, r3;
        max1 = s[0].m1;
        max2 = s[0].m2;
        max3 = s[0].m3;
        r1 = s[0].rollno;
        r2 = s[0].rollno;
        r3 = s[0].rollno;
        int maxTotal = s[0].totalMarks();
        int rollMaxTotal = s[0].rollno;

        for (int i = 1; i < n; i++) {
            if (s[i].m1 > max1) {
                max1 = s[i].m1;
                r1 = s[i].rollno;
            }
            if (s[i].m2 > max2) {
                max2 = s[i].m2;
                r2 = s[i].rollno;
            }
            if (s[i].m3 > max3) {
                max3 = s[i].m3;
                r3 = s[i].rollno;
            }
            int total = s[i].totalMarks();
            if (total > maxTotal) {
                maxTotal = total;
                rollMaxTotal = s[i].rollno;
            }
        }
        System.out.println(r1 + " " + max1);
        System.out.println(r2 + " " + max1);
        System.out.println(r3 + " " + max3);
        System.out.println(rollMaxTotal + " " + maxTotal);
        sc.close();
    }
}
