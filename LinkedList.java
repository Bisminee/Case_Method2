
public class LinkedList {

    NodeAntrianLinkedList head;
    NodeAntrianLinkedList tail;
    TransaksiQueue transaksi;

    boolean isEmpty() {
        return (head == null);
    }

    boolean isFull() {
        return (transaksi.IsFull());
    }

    int count(){
        NodeAntrianLinkedList tmp = head;
        int count = 0;
        while(tmp.next != null){
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    public void tambahAntrian(TransaksiPengisian input){
        NodeAntrianLinkedList ndBaru = new NodeAntrianLinkedList(input, null);
        if(isEmpty()){
            head = ndBaru;
            tail = ndBaru;
        } else if(!isEmpty()){
            tail.next = ndBaru;
            tail = ndBaru;
        } else if(isFull()){
            System.out.println("Antrian sudah penuh");
        }
    }

    public void tampilkanAntrian(){
        if(!isEmpty()){
            NodeAntrianLinkedList tmp = head;
            System.out.println("\n --- Antrian Kendaraan ---");
            while(tmp != null){
                tmp.data.kendaraan.tampilkanInformasiKendaraan();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void layaniKendaraan(){
        
    }
}
