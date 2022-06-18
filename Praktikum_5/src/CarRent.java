public class CarRent {
    public CarRider rider;
    public Car car;
    public int RentDur;

    public CarRent(CarRider rider, Car car, int RentDur){
        this.rider = rider;
        this.RentDur = RentDur;
        this.car = car;
    }

    public CarRider getRider(){
        return rider;
    }

    public Car getCar(){
        return car;
    }

    public int getRentDur(){
        return RentDur;
    }
}
