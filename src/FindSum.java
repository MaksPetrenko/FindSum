import java.util.Scanner;
public class FindSum {

    public static void main(String []args){
Scanner num = new Scanner(System.in);
System.out.print("int = ");
int a = num.nextInt();
System.out.print("float = ");
float b = num.nextFloat();
System.out.print("double = ");
double c = num.nextDouble();
double result = a + b + c;
System.out.println(result);
    }
}
