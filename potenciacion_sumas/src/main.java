
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int base, exp, sum = 0, rec = 0;

	System.out.println("Ingrese el numero que desea elevar");
	base = input.nextInt();

	System.out.println("Ingrese las veces que desea elevar el numero anterior");
	exp = input.nextInt();

	rec = potenciar(base, exp);
	System.out.println("El numero " + base + " elevado a la " + exp + " = " + rec);

    }

    public static int potenciar(int base, int exp) {

	int rec = 1;
	for (int i = 0; i < exp; i++) {
	    rec = proc_suma(rec, base);
	}

	return rec;
    }

    public static int proc_suma(int rec, int base) {

	int sum = 0;
	for (int i = 0; i < rec; i++) {
	    sum = sum + base;
	//    System.out.println(sum);

	}
	return sum;
    }

}