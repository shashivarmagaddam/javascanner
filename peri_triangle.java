import java.util.Scanner; 
public class peri_triangle{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the Length of the side 1 :"); 
        int side1 = sc.nextInt(); 
        System.out.print("Enter the Length of the side 2 :"); 
        int side2 = sc.nextInt(); 
        System.out.print("Enter the Length of the side 3 :"); 
        int side3 = sc.nextInt(); 
        int perimeter = side1 + side2 + side3;
        System.out.println("perimeter of triangle is : "+perimeter); 
    } 
} 