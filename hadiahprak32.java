import java.util.Scanner;
public class hadiahprak32{
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	double r;
	double luas;
	double phi = 3.14;
	System.out.print("Masukkan jari jari lingkaran :");
	r = masukan.nextDouble();
	luas = phi * r * r;
	System.out.println("Luas lingkaran = " +luas);
	}
}