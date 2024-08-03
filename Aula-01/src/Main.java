import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    float media=0, p1=0, p2=0, p3=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota P1: ");
		p1 = sc.nextFloat();
		
		
		System.out.print("Nota P2: ");
		p2 = sc.nextFloat();
		
		media = (p1 + p2) / 2 ;
		
		System.out.println("Média = " + media);
		System.out.printf("Média = %.2f%n", media);
		if (media >= 6) {
		    System.out.println("Aprovado!");
		} else {
		    System.out.println("Média menor que 6!");
		    System.out.print("Nota P3: ");
		    p3 = sc.nextFloat();
			media = maior(maior((p1+p2), (p1+p3)), (p2+p3)) / 2;  
			System.out.println("Média = " + media);
			if (media >= 6) 
		        System.out.println("Aprovado!");
		    else 
		        System.out.println("Reprovado!");
		}
		
	}
	
	public static float maior(float a, float b) {
	    if (a > b) 
	        return a;
	    return b;
	}
}
