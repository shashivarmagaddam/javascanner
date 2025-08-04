import java.util.Scanner;
public class squareArea{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the side of the square: ");
int side = scanner.nextInt();
System.out.println("The Area of the square is : "+(side*side));
}
}