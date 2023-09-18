import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("1.Sayıyı giriniz :");
	double a = input.nextDouble();

	System.out.print("2.Sayıyı giriniz :");
	double b = input.nextDouble();

	System.out.print("3.Sayıyı Giriniz :");
	double c = input.nextDouble();

	double sonuc = a + b * c - b;

	System.out.println("Sonuç : " + sonuc);
    }
}
