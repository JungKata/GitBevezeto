import java.util.Scanner;

public class feladat15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] tomb = new double[25];
        for (int i = 0; i < tomb.length; i++)
        {
        tomb[i] = Math.random() * 200 - 100;
        }

    }
}
