
public class LinkedListAntrian {

    NodeAntrianLinkedList head;
    NodeAntrianLinkedList tail;
    TransaksiQueue transaksi;

    boolean isEmpty() {
        return (head == null);
    }

    boolean isFull() {
        return (transaksi.IsFull());
    }

    int count() {
        NodeAntrianLinkedList tmp = head;
        if (tmp == null) {
            return 0;
        }
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    public void tambahAntrian(Kendaraan input) { // Add last
        NodeAntrianLinkedList ndBaru = new NodeAntrianLinkedList(input, null);
        if (isEmpty()) {
            head = ndBaru;
            tail = ndBaru;
            System.out.println(">> Kendaraan masuk ke dalam antrian");
        } else if (!isEmpty()) {
            tail.next = ndBaru;
            tail = ndBaru;
            System.out.println(">> Kendaraan masuk ke dalam antrian");
        } else if (isFull()) {
            System.out.println("Antrian sudah penuh");
        }
    }

    public void tampilkanAntrian() {
        if (!isEmpty()) {
            NodeAntrianLinkedList tmp = head;
            System.out.println("\n --- Antrian Kendaraan ---");

            while (tmp != null) {
                tmp.data.tampilkanInformasiKendaraan();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void layaniKendaraan(TransaksiPengisian input) {
        if (head == tail) {
            transaksi.Enqueue(input);
            head = tail = null;
            System.out.println(">> Transaksi berhasil dicatat");
        } else if (!isEmpty()) {
            transaksi.Enqueue(input);
            head = head.next;
            System.out.println(">> Transaksi berhasil dicatat");
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }
}
