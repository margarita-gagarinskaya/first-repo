public class Cosmetic {    protected String nameBrand;    protected String country;    protected int price;    public Cosmetic(String NameBrand, String country) {                      //конструктор        this.nameBrand = NameBrand;        this.country=country;    }    public Cosmetic(){//конструктор по умолчанию    }    public void setPrice(int price) {        this.price = price;    }    public void setNameBrand(String nameBrand) {        this.nameBrand = nameBrand;    }//свойство поля Наименование бренда    public void setCountry(String country) {        this.country = country;    }  //свойство поля Страна производитель    public void displayNameAndCountry(){        System.out.printf("Бренд: %s |\tСтрана производитель: %s\n", nameBrand, country);    }}