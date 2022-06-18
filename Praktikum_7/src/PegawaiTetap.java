class pegawaiTetap extends pegawai{
    private double upah;
    private double gaji;
    public pegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        setUpah(upah);
        setGaji();
    }

    public void setUpah(double upah){
        this.upah = upah;
    }

    public double getUpah(){
        return upah;
    }

    @Override
    public void setGaji(){
        this.gaji = getUpah();
    }

    @Override
    public double getGaji(){
        return gaji;
    }
    
    public void ToString(){
        System.out.println("\nPegawai Tetap\t: "+ getNama());
        System.out.println("No KTP\t\t: " + getNoKTP());
        System.out.println("Upah\t\t: " + getUpah());
        System.out.println("Pendapatan\t: " + "Rp" + getGaji());
    }
}