
public class TransaksiQueue { 

    TransaksiPengisian data[];
    int front;
    int rear;
    int max;
    int size;

    public TransaksiQueue() {
        front = rear = 0;
        max = 100;
        size = 0;
        data = new TransaksiPengisian[max];
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("\n--- Riwayat Transaksi ---");
            int i = front;
            while (i != rear) {
                System.out.println(data[i].kendaraan.platNomor + "  : Rp" + (data[i].bbm.hargaPerLiter * data[i].liter));
                i = (i + 1) % max;
            }
            System.out.println(data[i].kendaraan.platNomor + "  : Rp" + (data[i].bbm.hargaPerLiter * data[i].liter));
        }
    }

    public boolean Enqueue(TransaksiPengisian dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            return false;
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            System.out.println(">> Transaksi berhasil dicatat.");
            return true;
        }
    }

}
