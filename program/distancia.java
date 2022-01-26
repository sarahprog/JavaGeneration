package program;

import java.util.Scanner;

public class distancia {

	public static void main(String[] args) {
		   
	float X1,X2;
	float Y1,Y2;
	double d;
	
	Scanner sc= new Scanner(System.in);

	System.out.print("Digite valor de x1: ");
	X2= sc.nextFloat();
	System.out.print("Digite valor de x2: ");
	X1=sc.nextFloat();
	System.out.print("Digite valor de y1: ");
	Y1= sc.nextFloat();
	System.out.print("Digite valor de y2: ");
	Y2=sc.nextFloat();
	
	d=Math.sqrt(Math.pow((X2-X1),2) + Math.pow((Y2-Y1),2));
		
	System.out.print("A distância entre os pontos é: " +d);
	

	}

}
