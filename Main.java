
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListAntrian antri = new  LinkedListAntrian();
        TransaksiQueue riwayatTransaksi = new TransaksiQueue();
        int pilihan;
        do {
            System.out.println("\n --- MENU SPBU --- ");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String jenisKendaraan = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    antri.tambahAntrian(new Kendaraan(plat, jenisKendaraan, merk));
                    break;
                case 2:
                    antri.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println(">> Jumlah Kendaraan dalam antrian: " + antri.count());
                    break;
                case 4:
                    System.out.println("Petugas melayani " + antri.head.data.platNomor);
                    System.out.print("Masukkan Jenis BBM: ");
                    String jenisBBM = sc.nextLine();
                    System.out.print("Masukkan Harga Per Liter: ");
                    double hargaPerLiter = sc.nextDouble();
                    System.out.print("Masukkan Jumlah Liter: ");
                    double liter = sc.nextDouble();
                    riwayatTransaksi.Enqueue(new TransaksiPengisian(antri.head.data, new BBM(jenisBBM, hargaPerLiter), (hargaPerLiter * liter), liter));
                    break;
                case 5:
                    riwayatTransaksi.print();
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }
        } while (pilihan >= 1 && pilihan <= 5);
    }
}
