import java.util.Scanner;
public class hadiahprak31{
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	double celsius;
	double fahrenheit;
	System.out.print("Masukkan derajat celsius :");
	celsius = masukan.nextDouble();
	fahrenheit= (celsius*9/5) +32;
	System.out.println("Derajat Fahrenheit = " +fahrenheit);
	}
}
	