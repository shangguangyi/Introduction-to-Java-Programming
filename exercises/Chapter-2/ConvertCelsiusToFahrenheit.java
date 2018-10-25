import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsiusDegree = input.nextDouble();
        double fahrenheitDegree = (9.0 / 5) * celsiusDegree + 32;
        //对fahrenheitDegree保留小数点后1位（四舍五入）
        fahrenheitDegree = (int) (fahrenheitDegree * 10 + 0.5) / 10.0;

        System.out.println(celsiusDegree + " Celsius is " + fahrenheitDegree + " Fahrenheit");

    }
}
