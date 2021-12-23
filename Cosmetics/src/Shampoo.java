public class Shampoo  extends Hair {

    public String scalpType;

    public Shampoo() {
        //конструктор по умолчанию
    }

    public void setScalpType(String scalpType) {
        this.scalpType = scalpType;
    }

    public void displayFullInfoAboutShampoo() {
        System.out.printf("Код продукта: %s \tНаименовние продукта: %s \tТип кожи головы: %s \t" +
                        "Бренд: %s\tСтрана: %s\tЦена: %d\n", hairProductCod, hairProductName, scalpType,
                nameBrand, country, price);

    }
}