public class Shampoo  extends Hair {
    public String ScalpType;

    public Shampoo() {
        //конструктор по умолчанию
    }

    public void setScalpType(String scalpType) {
        ScalpType = scalpType;
    }

    public void display() {
        System.out.printf("Код продукта: %s \tНаименовние продукта: %s \tТип кожи головы: %s \t" +
                        "Бренд: %s\tСтрана: %s\tЦена: %d\n", CodOfProduct, NameOfProduct, ScalpType,
                NameBrand, country, Price);

    }
}