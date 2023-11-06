import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double num1;
        double num2;
        double num3;
        double promedio;

        System.out.println("ingresar el primer numero a calcular ");
        num1 = lector.nextDouble();

        System.out.println("ingresar el segundo numero a calcular");
        num2 = lector.nextDouble();

        System.out.println("ingresar el tercer numero a calcular ");
        num3 = lector.nextDouble();

        promedio = ((num1+num2+num3)/3);

        System.out.println("promedio de los tres numeros es:"+" "+promedio);

    }
}