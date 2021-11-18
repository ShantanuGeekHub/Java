//Checks if the entered number is Prime or Composite.

import java.util.Scanner;
public class Main
{
    static boolean prime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		if(n == 0 || n == 1){
		    System.out.println(n+" is nither prime nor composite.");
		}
		else{
		    if(prime(n)){
		        System.out.print(n+" is a prime number");
		    }
		    else{
		        System.out.println(n+" is a composite number");
		    }
		}
		
	}
}
