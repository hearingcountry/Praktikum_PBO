//Nama Praktikan : Dicky Surya Nanda
//Kelas Praktikan : PTI - B


class Layanan {
    private String name;
    private int price;
    private String description;

    // Constructor

    // Constructor
    public Layanan(String name, int price){
        setName(name);
        setPrice(price);
    }

    public Layanan(String name, int price, String description){
        setName(name);
        setPrice(price);
        setDescription(description);
    }

    // Basic Setter

    public void setName(String name){
        this.name =  name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description =  description;
    }

    // Basic Getters

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    // Public helper getFormatted Price
    // Mengembalikan string dengan format misalkan Rp. 1,000
    // Lihat Fungsi getFormattedPrice pada Helper.java
    public String getFormattedPrice(){
        // Rubah kode di sini
        return Helper.getFormattedPrice(price);
    }

    // To String return a formattet string of layanan
    // Mengembalikan string format yang bersesuaian dengan gambar pada lampiran
    public String toString(){
        return "Name\t\t\t: " + name.toString() + "\nPrice\t\t\t: " + getFormattedPrice();
    }
}