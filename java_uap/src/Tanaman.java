public abstract class Tanaman implements BuyableInterface {
    private String name;
    private double area;
    private double expensePerDay; // Harga pengeluaran untuk satu hektar per harinya
    private double pricePerUnit; // Harga per hektar

    // Zero Constructor
    public Tanaman() {

    }

    // Constructor
    public Tanaman(String name, double area, double expensePerDay, double pricePerUnit) {
        setName(name);
        setArea(area);
        setExpensePerDay(expensePerDay);
        setPricePerUnit(pricePerUnit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setExpensePerDay(double expensePerDay) {
        this.expensePerDay = expensePerDay;
    }

    public void setPricePerUnit(double pricePerHectare) {
        this.pricePerUnit = pricePerHectare;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getExpensePerDay() {
        return expensePerDay;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Method to return the total expense for an animal instance
    // It can be written as following:
    // quantity * expensePerDay
    public double getTotalExpense() {
        // Cone here
        return area * expensePerDay;
    }

    // Method to add resource to existing
    // Example, if you buy 1 hectar of Kepala Sawit, then you add it to "area"
    // attribute
    public void addResource(int quantityAdd) {
        // Code here
        area += quantityAdd;
    }

    // To String return a formatted string of hewan consisted of
    // Its name, quantitiy, and expese per day
    // Ex:
    // Nama : Cenkgeh
    // Luas : 50 hektar
    // Pengeluaran : Rp. 2.000.000 (per hari)
    @Override
    public String toString() {
        // Code here
        return "Nama: " + name + "\nLuas: " + area + " hektar\nPengeluaran: Rp. " + getTotalExpense();
    }

    // Abstract Methods
    public abstract double dailySell();

    public abstract double dailyProfit();
}