public class Decorative extends Cosmetic  {//implements ILuxury

    protected String info;
    protected String productOfBrand;

    public Decorative(){
//конструктор по умолчанию
    }

    public void setInfo(String info) {
     this.info = info;
    } //св-во поля Информация о том, что такое декоративная косметика

    public void setProductOfBrand(String productOfBrand) {
        this.productOfBrand = productOfBrand;
    }

    public void displayInfoAboutDecorative() {
        this.setInfo("""
        Декоративная косметика — это инструмент, с помощью которого
        можно создать дневной, вечерний образ, улучшить его,
        подчеркнуть достоинства и замаскировать недостатки внешности.
        Декоративная косметика — это набор специальных средств,
        с помощью которых создается макияж.
        К ней относятся: тональные средства, корректоры, румяна,
        средства для губ, декоративные средства для глаз и бровей.
        """);
        //вызвали свойство set
    }

    public String getInfo() {
        return info;
    }
    public void displayLuxuryBrand() {
        System.out.printf("%s\tПроизводит: %s, \n", nameBrand, productOfBrand);
    }
}
