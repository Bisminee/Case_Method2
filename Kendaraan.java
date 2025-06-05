public class Kendaraan {
    String platNomor, tipe, merk;

    public Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    void tampilkanInformasiKendaraan(){
        System.out.println("\nPlat Nomor\t\tTipe Kendaraan\t\tMerk HP");
        System.out.println(platNomor + "\t\t" + tipe + "\t\t" + merk);
    }
}
