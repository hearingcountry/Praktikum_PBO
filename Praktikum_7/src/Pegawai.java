class pegawai{
    private String nama;
    private String noKTP;
    private double gaji;

    public pegawai(String nama, String noKTP){
        setNama(nama);
        setNoKTP(noKTP);
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNoKTP(String noKTP){
        this.noKTP = noKTP;
    }

    public String getNoKTP(){
        return noKTP;
    }

    public void setGaji(){
        gaji = 0;
    }

    public double getGaji(){
        return gaji;
    }
}