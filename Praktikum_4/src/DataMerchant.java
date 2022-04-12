public class DataMerchant {

    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
       Merchant[] temp = new Merchant[DataMerchant.merc.length+1];
       for(int i=0; i<DataMerchant.merc.length; i++){
           temp[i] = DataMerchant.merc[i];
       }
       temp[DataMerchant.merc.length] = merchant;
       return temp;
    }

    public static void tampilData() {
        for (Merchant mch1 : merc) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant  : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk    : " + mch1.getNamaProduk());
            System.out.println("Harga          : " + (int) mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama) {
        for (Merchant i : merc) {
            if (i.getNamaMerchant().equals(nama)) return i;
        }
        return null;
    }

    public static void tampilMerchant(Merchant merchant) {
        System.out.println("Nama Merchant  : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk    : " + merchant.getNamaProduk());
        System.out.println("Harga          : " + merchant.getHargaMakanan());
    }


}


