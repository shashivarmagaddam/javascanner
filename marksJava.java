import java.util.Scanner; 
public class marksJava{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the Marks in subject 1 : "); 
        int s1 = sc.nextInt(); 
        System.out.print("Enter the Marks in subject 2 : "); 
        int s2 = sc.nextInt(); 
        System.out.print("Enter the Marks in subject 3 : "); 
        int s3 = sc.nextInt(); 
        System.out.println("The Total Marks in subjects : "+(s1+s2+s3));  
    } 
}