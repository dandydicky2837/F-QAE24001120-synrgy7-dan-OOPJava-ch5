import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan waktu parkir dalam jam
        System.out.print("Masukkan waktu parkir dalam jam: ");
        int hours = scanner.nextInt();

        // Memanggil method calculateParkingCost untuk menghitung biaya parkir
        double totalCost = calculateParkingCost(hours);

        // Menampilkan biaya parkir kepada pengguna
        System.out.println("Biaya parkir yang harus dibayar: $" + totalCost);

        scanner.close();
    }

    public static double calculateParkingCost(int hours) {
        double cost = 0;

        if (hours <= 5) {
            cost = 1;
        } else if (hours <= 24) {
            cost = 1 + (hours - 5) * 0.5;
        } else {
            cost = 15;
        }

        return cost;
    }
}
