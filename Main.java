
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do { 
            pilihan = sc.nextInt();
            
        } while (pilihan >= 1 && pilihan <= 5);
    }
}
