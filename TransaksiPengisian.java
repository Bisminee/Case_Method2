
public class TransaksiPengisian {

    Kendaraan kendaraan;
    BBM bbm;
    double totalBayar, liter;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double totalBayar, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.totalBayar = totalBayar;
        this.liter = liter;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public BBM getbbm () {
        return bbm;
    }

    public double getLiter() {
        return liter;
    }

    public double gettotalBayar() {
        return totalBayar;
    }

    public void tampilTransaksi() {
        System.out.println(kendaraan.getPlatNomor() +
        " - " + bbm.getNamaBBM() +
        " - " + liter + " liter " +
        ": Rp " + totalBayar);
    }
}
