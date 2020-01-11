import java.util.Scanner;
public class triangle {
public static void main(String[] args) {
// Entering the value of the variable n
System.out.print("n = ");
Scanner input = new Scanner(System.in);
int n = input.nextInt();
System.out.println();
// Printing the upper part of the triangle
for (int line = 1; line <= n; line++) {
printLine(1, line);
}
// Printing the bottom part of the triangle
// that is under the longest line
for (int line = n - 1; line >= 1; line--) {
printLine(1, line);
}
}
private static void printLine(int start, int end) {
for (int i = start; i <= end; i++) {
System.out.print(" " + i);
}
System.out.println();
}
}