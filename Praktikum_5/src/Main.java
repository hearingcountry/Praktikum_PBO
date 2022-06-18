public class Main {
    public static void main(String[] args) {

        CarRider ming = new CarRider("Max Verstapen", 24, "8746293847");
        CarRider yohan = new CarRider("Lewis Hamilton", 37, "946385739");
        CarRider ling = new CarRider("Charles Leclerc", 23, "23623846583");
        CarRider mauren = new CarRider("Sebastian Vettel", 32, "2846592743");

        CarData acc = new CarData();
        acc.addCar("Honda", "RB 33 MV", "Red Bull Honda");
        acc.addCar("Mercedes", "W 44 LH", "Mercedes AMG F1");
        acc.addCar("Ferrari", "SF 55 CL", "Scuderia Ferrari");
        acc.addCar("Aston Martin", "AMR 5 SV", "Aston Martin Cognizan");

        acc.listOfCar();

        RentArchive data = new RentArchive();
        data.Rent(ming, acc.carList.get(0), 4);
        data.Rent(yohan, acc.carList.get(0), 2);
        data.Rent(ling, acc.carList.get(2), 1);
        data.Rent(mauren, acc.carList.get(3), 5);

        System.out.println();
        Car.setStatus("true");
        Car.setStatus("true");
        Car.setStatus("false");
        Car.setStatus("true");

        System.out.println();
        data.info();
    }
}
