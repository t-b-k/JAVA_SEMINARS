package seminar7;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Бутылка с водой");
        product1.price = 100.15;
        product1.brand = "ООО Источник";
        System.out.println(product1.displayInfo());

        Product product2 = new Product("Бутылка с молоком", 120.25);
        System.out.println(product2.displayInfo());
    }
}
