public class Medicine implements BuyableInterface {
    private String name;
    private double pricePerUnit;
    private int duration; // Duration in day of drug effect to subject

    public Medicine() {

    }

    public Medicine(String name, double pricePerUnit, int duration) {
        setName(name);
        setPrice(pricePerUnit);
        setDuration(duration);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.pricePerUnit = price;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getDuration() {
        return duration;
    }

    // Method to reduce duration of drug effect for each day
    public void reduceDuration() {
        duration--;
    }

    // Do nothing
    public void addResource(int quantityAdd) {
        // Do nothing
    }

    // Method to return boolean if the drug is still in effect or not
    // PS: The drug is not in effect whether the duration runs out
    public boolean isInEffect() {
        // Code here
        if (duration > 0) {
            return true;
        }
        return false;
    }
}