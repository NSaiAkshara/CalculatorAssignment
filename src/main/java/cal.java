import java.util.Scanner;
public class cal {
    public static double add(double a,double b){
    	return a+b;
    }
    public static double sub(double a,double b){
    	return a>b?a-b:b-a;
    }
    public static void main(String args[]) {
    	double x, y, sum;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter first number:");
    	x = sc.nextDouble();
    	System.out.println("Enter second number:");
    	y = sc.nextDouble();
        System.out.println("Choose from the following options:");
        int ch;
        System.out.println("1 to add");
        System.out.println("2 to subtract");
        System.out.println("3 to multiply");
        System.out.println("4 to divide");
        ch = sc.nextInt();
        if(ch==1){
		sum = add(x,y);
    		System.out.println("Sum is: " + sum);
        }
    	else if(ch==2){
		sum = sub(x,y);
    		System.out.println("Sum is: " + sum);
        }
	else if(ch==3){
		sum = add(x,y);
    		System.out.println("Sum is: " + sum);
        }
	else if(ch==4){
		sum = sub(x,y);
    		System.out.println("Sum is: " + sum);
        }
	else{
		System.out.println("You chose an invalid input");
	}
    }
}

    
