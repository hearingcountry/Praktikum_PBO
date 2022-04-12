import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Nama    : Dicky Surya Nanda
                NIM     : 215150600111031 """);
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Geprek Bensu", "Ayam Geprek", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Mie Ayam Jawara", "Mie Ayam", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Presiden", "Bakso", 8000));
        System.out.println("Masukkan Nama Merchant, Nama Produk, Harga Makanan : ");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(in.nextLine(), in.nextLine(), in.nextDouble()));
        DataMerchant.tampilData();
    }
}
