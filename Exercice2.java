import java.util.*;
class Exercice2 {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a value for X:");
        int x = sc.nextInt();
        
        System.out.println("Enter a value for Y:");
        int y = sc.nextInt();
        
        big(x,y);
        
	}

    public static void big(String A, String B) {
        int C = (A>=B) ? A : B;
        System.out.println(C + " is the bigger number.");
    }
}