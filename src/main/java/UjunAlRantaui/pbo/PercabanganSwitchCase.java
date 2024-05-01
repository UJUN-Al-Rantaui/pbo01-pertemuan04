package UjunAlRantaui.pbo;

import java.util.Scanner;

public class PercabanganSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                <================== Pilih tema Warna ==================>
                  1. Merah
                  2. Kuning
                  3. Hijau
                  4. Biru""");
        System.out.print("Pilih warna : ");
        String warna = scanner.nextLine();
        switch(warna.toLowerCase()) {
            case "1", "merah" : System.out.println("\033[0;31m"); break;
            case "2", "kuning": System.out.println("\033[0;33m"); break;
            case "3", "hijau": System.out.println("\033[0;32m"); break;
            case "4", "biru": System.out.println("\033[0;34m"); break;
            default: System.out.println("\033[0m");
        }

        System.out.println("""
        <============= Kalkulator =============>
        1. Tambahan
        2. Perkalian
        3. Pengurangan
        4. Pembagian""");
        System.out.print("Pilih Opearsi : ");
        String operasi = scanner.nextLine();

        System.out.print("Masukkan nilai pertama : ");
        Integer nilaiPertama = scanner.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        Integer nilaiKedua = scanner.nextInt();

        Integer hasil = switch(operasi.toLowerCase()){
            case "1", "tambahan" -> nilaiPertama + nilaiKedua;
            case "2", "perkalian" -> nilaiPertama * nilaiKedua;
            case "3", "pengurangan" -> nilaiPertama - nilaiKedua;
            case "4", "pembagian" -> nilaiPertama / nilaiKedua;
            default -> {
                System.out.println("Tidak ada operator yg sesuai dengan pilihan anda");
                yield 0;
            }
        };

        System.out.printf("Hasil : %d\r\n",hasil);
    }
}
