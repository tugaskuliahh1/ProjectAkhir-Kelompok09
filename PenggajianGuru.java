import java.util.Scanner;

/**
 * PenggajianGuru
 */
public class PenggajianGuru {

    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner penggajian = new Scanner(System.in);

        // variabel input
        String NamaGuru, Jabatan;
        int NIP, Lama_mengajar;
        long Gaji_pokok, total;

        // Isi variable
        Gaji_pokok = 3000000;

        System.out.print("Masukkan nama guru: ");
        NamaGuru = penggajian.next();
        System.out.print("Masukkan NIP: ");
        NIP = penggajian.nextInt();
        System.out.print("Masukkan jabatan: ");
        Jabatan = penggajian.next();
        System.out.print("Masukkan lama mengajar: ");
        Lama_mengajar = penggajian.nextInt();
        System.out.println();

        // perhitungan total
        total = Gaji_pokok * Lama_mengajar;

        // output
        System.out.println("=====Selamat Menikmati Gaji");
        System.out.println("Nama Guru:: " + NamaGuru);
        System.out.println("NIP: " + NIP);
        System.out.println("Jabatan: " + Jabatan);
        System.out.println("Lama Mengajar: " + Lama_mengajar + " Bulan");
        System.out.println("Total Gaji: Rp " + total + ",00\n");
        System.out.println(
                "         Gunakan Gaji Anda Dengan Penuh Manfaat \nKarena Hasil Kerja Kerasmu Tidak Pantas Untuk Di Sia-Siakan");
                System.out.println("selesai proses");
    }
}

