import java.util.Scanner;
/**
 * KafeDoWhile03
 */
public class KafeDoWhile03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.print("Transaksi");
            break;
        }
        System.out.print("Jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.print("Jumlah teh: ");
        teh = sc.nextInt();
        System.out.print("Jumlah roti: ");
        roti = sc.nextInt();

        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh)+ (roti * hargaRoti);
        System.out.print("Total yang harus dibayar: Rp " + totalHarga);
        sc.nextLine();
        }while (true);

        System.out.print("Semua transaksi selseai. ");

        sc.close();
    }
}
