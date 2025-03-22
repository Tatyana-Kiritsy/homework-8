import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int[] i = new int[]{1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        char[] c = new char[10];
        System.out.println();
        System.out.println("task 2");
        for (int a = 0; a < i.length; a++) {
            if (a == i.length - 1) {
                System.out.print(i[a]);
                break;
            }
            System.out.print(i[a] + ", ");
        }
        System.out.println();
        for (int d = 0; d < b.length - 1; d++) {
            System.out.print(b[d] + ", ");
        }
        System.out.print(b[b.length - 1]);
        System.out.println();
        for (int e = 0; e < c.length; e++) {
            if (e == c.length - 1) {
                System.out.print(c[e]);
                break;
            }
            System.out.print(c[e] + ", ");
        }
        System.out.println();
        System.out.println("task 3");
        for (int a = i.length - 1; a >= 0; a--) {
            if (a == 0) {
                System.out.print(i[a]);
                break;
            }
            System.out.print(i[a] + ", ");
        }
        System.out.println();
        for (int d = b.length - 1; d > 0; d--) {
            System.out.print(b[d] + ", ");
        }
        System.out.print(b[0]);
        System.out.println();
        for (int e = c.length -1; e > 0; e--) {
            System.out.print(c [e] + ", ");
        }
        System.out.print(c [0]);
        System.out.println();
        System.out.println("task 4");
        for (int a = 0; a < i.length; a++) {
            if (i [a]%2 != 0) {
                i[a] += 1;
            }
            System.out.println(i [a]);
        }
    }
}

