import java.util.Scanner;
public class RataSiswa06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai,ratarata=0, totalNilai = 0;
        int jmlsiswa = 0;
        int siswadiatasrata = 0, siswadibawahrata=0;
        String nama;
        while (true) {
            System.out.print("Masukkan Nama Siswa (Ketik 'Selesai' Untuk Berhenti): ");
            nama = sc.nextLine();
            if (nama.equalsIgnoreCase("selesai")) 
                {break;}
            System.out.print("Masukkan nilai siswa "+nama+" : ");
            nilai = sc.nextDouble();
            sc.nextLine();
            totalNilai = totalNilai + nilai;
            jmlsiswa++;
                if (nilai > ratarata) 
                    { siswadiatasrata++;}
                else 
                    { siswadibawahrata++; }
                 
            ratarata = totalNilai / jmlsiswa;
        }
        boolean mayoritas = siswadiatasrata > (jmlsiswa / 2);

        System.out.println("\nHasil:");
        System.out.println("Total Jumlah Siswa : "+ jmlsiswa);
        System.out.println("Rata-rata Nilai Siswa: " + ratarata);
        System.out.println("Jumlah Siswa dengan Nilai di Atas Rata-rata: " + siswadiatasrata);
        System.out.println("Jumlah Siswa dengan Nilai di Bawah Rata-rata: " + siswadibawahrata);
        if (mayoritas) {
            System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
        } else {
            System.out.println("Mayoritas siswa tidak memiliki nilai di atas rata-rata.");
        }
    }
}

    
