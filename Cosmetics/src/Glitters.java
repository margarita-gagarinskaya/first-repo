public class Glitters extends Shadows {

    private String tone;
    private int numberOfColor;
    private String productDescription;

    public Glitters() {
        //конструктор по умолчанию
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setNumberOfColor(int numberOfColor) {
        this.numberOfColor = numberOfColor;
    }

    public void displayFullInfoAboutGlitters() {
        System.out.printf("Код продукта: %s \tНаименовние продукта: %s \tВид теней: %s \t" +
                        "Бренд: %s\tСтрана: %s\tКол-во цветов: %d\tЦена: %d\n", shadowProductCode, shadowProductName, tone,
                nameBrand, country, numberOfColor, price);
    }

    public void displayLuxuryBrand() {
        System.out.printf("""
                        Код продукта: %s \tНаименовние продукта: %s \t
                        Вид теней: %s \t
                        Бренд: %s\tСтрана: %s\t
                        Кол-во цветов: %d\tЦена: %d руб.
                        
                        Описание продукта: %s\t
                        """,
                shadowProductCode, shadowProductName, tone,
                nameBrand, country, numberOfColor, price, productDescription);
    }
}

