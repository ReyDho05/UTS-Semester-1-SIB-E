import java.util.Scanner;
public class ManajemenStok06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int jumlahStok,permintaan;
        double harga,totalNilaiStok;
        while (true) {
            System.out.print("Masukkan nama barang (ketik 'selesai' untuk berhenti): ");
            nama = sc.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                System.out.println("Data Selesai Diinput");
                break;      
            }
            System.out.print("Masukkan jumlah stok barang: ");
            jumlahStok = sc.nextInt();
            System.out.print("Masukkan harga per unit barang: ");
            harga = sc.nextDouble();
            totalNilaiStok = jumlahStok * harga;
            System.out.println("Total nilai stok " + nama + ": " + totalNilaiStok);
            System.out.print("Masukkan jumlah permintaan barang: ");
            permintaan = sc.nextInt();

            if (permintaan <= jumlahStok) {
                jumlahStok -= permintaan;
                System.out.println("Permintaan dapat dipenuhi.");
                System.out.println("Sisa stok " + nama + ": " + jumlahStok);
            } else { 
                permintaan-=jumlahStok;
                System.out.println("Permintaan tidak dapat dipenuhi. Stok kurang "+permintaan);
            }
            sc.nextLine();
        }
    }
}
