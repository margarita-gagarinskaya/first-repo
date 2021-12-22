public class Shadows extends Decorative {

    protected String NameOfProduct;
    protected String CodOfProduct;
    public Shadows() {
        //конструктор по умолчанию
    }

    public void setNameOfProduct(String nameOfProduct) {
        NameOfProduct = nameOfProduct;
    }

    public void setCodOfProduct(String codOfProduct) {
        CodOfProduct = codOfProduct;
    }
    public void Sh() {
        this.setCodOfProduct("01");
        this.setNameOfProduct("Тени");
    }

    public String getCodOfProduct() {
        return CodOfProduct;
    }

    public String getNameOfProduct() {
        return NameOfProduct;
    }
}

