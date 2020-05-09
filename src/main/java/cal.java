import java.util.Scanner;
public class cal {
    public static double add(double a,double b){
    	return a+b;
    }
    public static double sub(double a,double b){
    	return a>b?a-b:b-a;
    }
    public static double mul(double a,double b){
    	return a*b;
    }
    public static double div(double a,double b){
    	return a/b;
    }
    public static void main(String args[]) {
    	double x=5.2, y=3.6, result;
	result = add(x,y);
    	System.out.println("Add 5.2 and 3.6 = " + result);
    	result = sub(x,y);
    	System.out.println("Sub 5.2 and 3.6 = " + result);
	result = mul(x,y);
    	System.out.println("Mul 5.2 and 3.6 = " + result);
	result = div(x,y);
    	System.out.println("Div 5.2 and 3.6 = " + result);
    }
}

    
