public class Glitters extends Shadows {

    private String tone;
    private int numberOfColor;

    public Glitters() {
        //конструктор по умолчанию
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public void setNumberOfColor(int numberOfColor) {
        this.numberOfColor = numberOfColor;
    }

    public void displayFullInfoAboutGlitters() {
        System.out.printf("Код продукта: %s \tНаименовние продукта: %s \tВид теней: %s \t" +
                        "Бренд: %s\tСтрана: %s\tКол-во цветов: %d\tЦена: %d\n", shadowProductCode, shadowProductName, tone,
                nameBrand, country, numberOfColor, price);

    }
}

