class sales extends pegawai {
    private int penjualan;
    private double komisi;
    private double gaji;

    public sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);
        setGaji();
    }
    
    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }

    public int getPenjualan(){
        return penjualan;
    }

    public void setKomisi(double komisi){
        this.komisi = komisi;
    }

    public double getKomisi(){
        return komisi;
    }

    @Override
    public void setGaji(){
        this.gaji = getPenjualan() * getKomisi();
    }

    @Override
    public double getGaji(){
        return gaji;
    }

    public void ToString(){
        System.out.println("\nSales\t\t: "+ getNama());
        System.out.println("No KTP\t\t: " + getNoKTP());
        System.out.println("Total Penjualan\t: " + getPenjualan());
        System.out.println("Besaran Komisi\t: " + "Rp" + getKomisi());
        System.out.println("Pendapatan\t: " + "Rp" + getGaji());
    }
}
