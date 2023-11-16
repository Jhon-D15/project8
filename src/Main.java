import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double num1;
        double num2;
        double num3;
        double promedio;

        System.out.println("////////////////////////////////////////////////////////");


        System.out.println("debes ingresar un primer numero para empezar a calcular ");
        num1 = lector.nextDouble();

        System.out.println("debes ingresar un segundo numero para calcular");
        num2 = lector.nextDouble();

        System.out.println("debes ingresar un tercer numero para calcular ");
        num3 = lector.nextDouble();

        promedio = ((num1+num2+num3)/3);

        System.out.println("el promedio de los tres numeros calculados es:"+" "+promedio);

    }
}
