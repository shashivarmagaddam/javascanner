import java.util.Scanner; 
public class peri_rec{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the length of the Rectangle : "); 
        int len = sc.nextInt(); 
        System.out.print("Enter the breadth of the Rectangle : "); 
        int bre = sc.nextInt(); 
        System.out.println("The Perimeter of the rectangle is : "+2*(len+bre)); 
    } 
}