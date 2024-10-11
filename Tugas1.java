import java.util.Scanner;
    public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int harga = 50000, jml, totalTiketTerjual = 0;
    double diskon = 0, totalHarga = 0, nominalBayar;

    while (true) {
        System.out.print("Masukkan jumlah tiket yang akan dibeli: ");
        jml = sc.nextInt();
        totalHarga = harga * jml;

        if (jml < 0) {
            System.out.println("Jumlah tidak valid. Masukkan lagi jumlah yang valid!");
            continue;
        } else if (jml > 4 && jml < 10) {
            diskon = 0.10;
        } else if (jml > 10) {
            diskon = 0.15;
        } else {
            diskon = 0;
        }

        nominalBayar = totalHarga - (totalHarga * diskon);
        System.out.println("Total harga yang harus dibayar: Rp." + nominalBayar);

        totalTiketTerjual += jml;
        System.out.println("Total tiket terjual dalam sehari: " + totalTiketTerjual);
        }
    }
}

