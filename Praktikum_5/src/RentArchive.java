import java.util.ArrayList;

public class RentArchive {
    public static ArrayList<CarRent> rentData= new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){
        rentData.add(new CarRent(rider, car, rentDur));
    }

    public void info(){
        System.out.println("-------------------------------");
        System.out.println("    INFORMASI PELANGGAN");
        System.out.println("-------------------------------");
        for (CarRent sc : RentArchive.rentData) {
            System.out.println("NAMA PEMINJAM   : " + sc.getRider().getName());
            System.out.println("TIPE MOBIL      : " + sc.getCar().getCarType());
            System.out.println("NO. POLISI      : " + sc.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + sc.getRentDur());
            System.out.println("-------------------------------");
        }
    }
}
