
public class Kendaraan {

    String platNomor, tipe, merk;

    public Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    void tampilkanInformasiKendaraan() {
        System.out.println("Plat Nomor     :" + platNomor + "\nTipe Kendaraan : " + tipe + "\nMerk           : " + merk);
        System.out.println("-----------------------");
    }
}
