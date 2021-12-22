public class Glitters extends Shadows {
    private String Tone;
    private int NumberOfColor;

    public Glitters() {
        //конструктор по умолчанию
    }

    public void setTone(String tone) {
        Tone = tone;
    }

    public void setNumberOfColor(int numberOfColor) {
        NumberOfColor = numberOfColor;
    }

    public void display() {
        System.out.printf("Код продукта: %s \tНаименовние продукта: %s \tВид теней: %s \t" +
                        "Бренд: %s\tСтрана: %s\tКол-во цветов: %d\tЦена: %d\n", CodOfProduct, NameOfProduct, Tone,
                NameBrand, country, NumberOfColor, Price);

    }
}

