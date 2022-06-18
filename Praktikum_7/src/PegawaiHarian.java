public class PegawaiHarian extends pegawai{
    private double upahPerJam;
    private double totalJam;
    private double gaji;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, double totalJam){
        super(nama, noKTP);
        setUpahPerJam(upahPerJam);
        setTotalJam(totalJam);
        setGaji();
    }
    
    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }

    public double getUpahPerJam(){
        return upahPerJam;
    }

    public void setTotalJam(double totalJam){
        this.totalJam = totalJam;
    }

    public double getTotalJam(){
        return totalJam;
    }

    @Override
    public void setGaji(){
        if(getTotalJam() <= 40){
            this.gaji = getUpahPerJam() * getTotalJam();
        } else{
            this.gaji = 40 * getUpahPerJam() + (getTotalJam() - 40) * getUpahPerJam() * 1.5;
        }
    }

    @Override
    public double getGaji(){
        return gaji;
    }

    public void ToString(){
        System.out.println("\nPegawai Harian\t: "+ getNama());
        System.out.println("No KTP\t\t: " + getNoKTP());
        System.out.println("Upah\t\t: " + getUpahPerJam());
        System.out.println("Total Jam\t: " + getTotalJam());
        System.out.println("Pendapatan\t: " + "Rp" + getGaji());
    }
}
