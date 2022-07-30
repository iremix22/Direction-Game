


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------------------");
		System.out.println("--Welcome to Game--");
		System.out.println("----------------------");
		
		Scanner sc = new Scanner(System.in);
		
		int x=2;
		int y=2;
		int direction;
		
		
		do {
			print(x,y);
			direction=sc.nextInt();
			switch(direction) {
			case 4 : 
				y--;
				if(y==-1) {
					y=4;
				}
				break;
			case 6 : 
				y++;
				if(y==5) {
					y=0;
				}
				break;
			case 2 : 
				x++;
				if(x==5) {
					x=0;
				}
				break;
			case 8 : 
				x--;
				if(x==-1) {
					x=4;
				}
				default: break;
			}
		}while(direction!=0);
			
	}// main 
	

		public static void  print(int x,int y) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==x && j==y) {
					System.out.print("* ");
				}else {
				
				System.out.print(". ");
				}
			}
			System.out.println("");
		}
		
		
	}//method

}// class
