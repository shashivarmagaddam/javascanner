import java.util.Scanner; 
public class average{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the Marks in subject 1 : "); 
        int s1 = sc.nextInt(); 
        System.out.print("Enter the Marks in subject 2 : "); 
int s2 = sc.nextInt(); 
System.out.print("Enter the Marks in subject 3 : "); 
int s3 = sc.nextInt(); 
System.out.printf("The Average Marks in subjects : %.2f",((s1+s2+s3)/3f));  
} 
}