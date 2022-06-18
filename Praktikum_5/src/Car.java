public class Car {
    public String carType;
    public String polNum;
    public String merk;
    public boolean status;

    public Car(String carType, String polNum, String merk){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = true;
    }
    public String getCarType(){
        return carType;
    }
    public String getPolNum(){
        return polNum;
    }
    public String getMerk(){
        return merk;
    }
    public boolean isStatus(){
        return status;
    }
    public static void setStatus(String status){
        if(status == "true"){
            System.out.println("MOBIL BERHASIL DISEWA");
        }else{
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
}
