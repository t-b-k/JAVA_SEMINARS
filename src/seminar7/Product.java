package seminar7;

public class Product {
    protected String name;
    protected String brand;
    protected double price;
    protected int param1;
    protected String param2;
    protected boolean param3;
    String param4;
    /**
     * ИНИЦИАЛИЗАТОР
     */
    {

    }
// accessor
    public double getPrice() {
        return price;
    }
// mutator
    public void setPrice (double price) {
        if (price <= 0)
            throw new RuntimeException("");
        else
            this.price = price;
    }

    public void setName (String name) {
        this.name = name;
    }
    public void setBrand (String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }

    /**
    * Конструктор класса Product
    */
    public Product() {
        name = "Продукт";
        brand = "NoName";
        price = 1;
    }
    public Product (String inputName) {
        name = inputName;
    }
    public Product (String inputName, double inputPrice) {
        name = inputName;
        price = inputPrice;
    }
    public Product (String inputBrand, String inputName, double inputPrice) {
        brand = inputBrand;
        name = inputName;
        price = inputPrice;
    }
    /**
     * Получить информацию о продукте
     * */
    String displayInfo() {

        return String.format("%s - %s - %f", brand, name, price);
    }
}
