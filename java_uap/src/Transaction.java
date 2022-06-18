public class Transaction {
    private String description;
    private double totalPrice;
    private int date;
    private String actor;

    // Zero constructor
    public Transaction() {

    }

    // With params constructor
    public Transaction(String description, double totalPrice, int date, String actor) {
        setDescription(description);
        setTotalPrice(totalPrice);
        setDate(date);
        setActor(actor);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDescription() {
        return description;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getDate() {
        return date;
    }

    public String getActor() {
        return actor;
    }

    // To String return a formatted string of ayam consisted of
    // Its name, quantitiy, and expese per day (you can get this with "super")
    // Ex:
    // Description : Booster Ayam
    // Nominal : Rp. 1,500,000
    // Hari Beli : Hari 6
    // Pembeli : Pak Joko
    @Override
    public String toString() {
        return String.format("Description\t: %s \nNominal\t\t: Rp. %,.2f \nHari Beli\t: Hari %d \nPembeli\t\t: %s \n",
                getDescription(), getTotalPrice(), getDate(), getActor());
    }
}