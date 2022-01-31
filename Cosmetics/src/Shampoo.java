public class Shampoo  extends Hair {

    private String scalpType;
    private String productDescription;

    public Shampoo() {
        //конструктор по умолчанию
    }

    public void setScalpType(String scalpType) {
        this.scalpType = scalpType;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void displayFullInfoAboutShampoo() {
        System.out.printf("Код продукта: %s \tНаименовние продукта: %s \tТип кожи головы: %s \t" +
                        "Бренд: %s\tСтрана: %s\tЦена: %d\n", hairProductCode, hairProductName, scalpType,
                nameBrand, country, price);
    }
    public void displayLuxuryBrand() {
        System.out.printf("""
                        Код продукта: %s \tНаименовние продукта: %s \t
                        Тип кожи головы: %s \t
                        Бренд: %s\tСтрана: %s \tЦена: %d руб.
                        
                        Описание продукта: %s\t""",
                hairProductCode, hairProductName, scalpType,
                nameBrand, country, price, productDescription);
    }
}