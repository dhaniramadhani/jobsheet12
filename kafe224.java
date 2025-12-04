public class kafe224 {
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
        Menu("Budi", true,"D50");
        
    }
}
