public class Cosmetic implements ILuxury {    protected String nameBrand;    protected String country;    protected int price;    public Cosmetic(String NameBrand, String country) {                      //конструктор        this.nameBrand = NameBrand;        this.country = country;    }    public Cosmetic() {//конструктор по умолчанию    }    public void setPrice(int price) {        this.price = price;    }    public void setNameBrand(String nameBrand) {        this.nameBrand = nameBrand;    }//свойство поля Наименование бренда    public void setCountry(String country) {        this.country = country;    }  //свойство поля Страна производитель    public String getNameBrand() {        return nameBrand;    }    public String getCountry() {        return country;    }    public void displayInfoAboutDecorative() {        System.out.printf("Бренд: %s |\tСтрана производитель: %s\n", nameBrand, country);    }    public void displayLuxuryBrand() {        System.out.printf("%s\tСтрана: %s \n", nameBrand, country);    }}