import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 5, total, start = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Km cinsinden mesafeyi yazın: ");
        km = input.nextInt();
        total = (km * perKm);
        total += start;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);
    }
}