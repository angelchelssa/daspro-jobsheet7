import java.util.Scanner;

public class Pertanyaan4Percobaan1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tertinggi = 0, terendah = 100, lulus = 0, tidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();

            if (nilai >= 0 && nilai <= 100) {
                tertinggi = Math.max(tertinggi, nilai);
                terendah = Math.min(terendah, nilai);

                if (nilai >= 60) {
                    lulus++;
                } else {
                    tidakLulus++;
                }
            } else {
                System.out.println("Nilai tidak valid.");
                i--; 
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        sc.close();
    }
}
