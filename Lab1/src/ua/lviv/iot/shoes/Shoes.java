package ua.lviv.iot.shoes;

public class Shoes extends Object {

    private String name;
    private double price;
    private double size;
    private String country;
    private int year;

    protected String company;
    protected double lengthOfFoot;

    private static int objectCount;

    public Shoes(String name, double price, double size, String country,
                 int year, String company, double lengthOfFoot) {
        resetValues(name, price, size, country, year, company, lengthOfFoot);
        objectCount++;
    }

    public Shoes(String name, double price, double size, String country, int year) {
        this(name, price, size, country, year, null, 0);
    }

    public Shoes() {
        this(null, 0, 0, null, 0, null, 0);
    }

    public void resetValues(String name, double price, double size, String country,
                          int year, String company, double lengthOfFoot) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.country = country;
        this.year = year;
        this.company = company;
        this.lengthOfFoot = lengthOfFoot;
    }




    @Override
    public String toString() {
        return "ua.lviv.iot.shoes.pair of shoes:" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", company='" + company + '\'' +
                ", lengthOfFoot='" + lengthOfFoot + '\'';
    }

    public static void printStaticObjectCount(){
        System.out.println(objectCount);
   }
   public void printObjectCount(){
       System.out.println(objectCount);
   }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getLengthOfFoot() {
        return lengthOfFoot;
    }

    public void setLengthOfFoot(double lengthOfFoot) {
        this.lengthOfFoot = lengthOfFoot;
    }
}