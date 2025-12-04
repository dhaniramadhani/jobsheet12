import java.util.Scanner;

public class Kafee {
    public static int hitTotHrg(int pilMenu,int banyakItem,String kodePromo) {
        int [] hargaItem = {15000,20000,22000,12000,10000,18000};
        int Hrgtot = hargaItem[pilMenu -1]*banyakItem;
        int totalDis = 0;

        if (kodePromo.equals("D50")) {
            totalDis = Hrgtot * 50/100;
            System.out.println("Diskon 50% : Rp "+totalDis);
        }else if (kodePromo.equals("D30")) {
            totalDis = Hrgtot *30/100;
            System.out.println("Diskon 30% : Rp "+totalDis);
        }else{
            System.out.println("Kode Promo Invalid");
        }

        return Hrgtot - totalDis;
    }
    public static void Menu(String namaPel,boolean isMember,String kodePromo) {
        System.out.println("Selamat Datang, "+namaPel+"!");
        if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan diskon 10% untuk setiap pembelian ");
            
        }
        if (kodePromo.equals("D50")) {
            System.out.println("Kode Promo Valid: Diskon 50%");
        }else if (kodePromo.equals("D30")) {
            System.out.println("Kode Promo Valid: Diskon 30%");
        }else{
            System.out.println("Kode Promo Invalid");
        }
        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi Hitam - Rp.15.000");
        System.out.println("2. Cappucino  - Rp.20.000");
        System.out.println("3. Latte      - Rp.22.000");
        System.out.println("4. Teh Tarik  - Rp.12.000");
        System.out.println("5. Roti Bakar - Rp.10.000");
        System.out.println("6. Mie Goreng - Rp.18.000");
        System.out.println("======================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan");
    }
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Masukkan Kode Promo : ");
    String kodePromo = s.next();
    Menu("Budi", true, kodePromo);
    
    int totalAkhir = 0;
    String lanjut;

    do{
     System.out.print("Masukan Nomor Menu Yang ingin anda Pesan: ");
    int pilMenu = s.nextInt();

    System.out.print("Masukan Jumlah Item Yang ingin Dipesan: ");
    int banyakItem = s.nextInt();

    int Hrgtot = hitTotHrg(pilMenu, banyakItem, kodePromo);
    System.out.println("Total Harga Yang Pesanan Anda: Rp. " + Hrgtot);

    totalAkhir +=Hrgtot;
    System.out.println("Tambah Pesanan Apa Tidak? (Y/N)");
    lanjut = s.nextLine();

    }while(lanjut.equalsIgnoreCase("y"));

    System.out.println("Total Akhir: "+totalAkhir);


}
}

