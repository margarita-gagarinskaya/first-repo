public class Hair extends Care {

    protected String NameOfProduct;
    protected String CodOfProduct;
    public Hair() {
        //конструктор по умолчанию
    }

    public void setNameOfProduct(String nameOfProduct) {
        NameOfProduct = nameOfProduct;
    }

    public void setCodOfProduct(String codOfProduct) {
        CodOfProduct = codOfProduct;
    }
    public void Ha() {
        this.setCodOfProduct("03");
        this.setNameOfProduct("Средства для волос|");
    }

    public String getCodOfProduct() {
        return CodOfProduct;
    }

    public String getNameOfProduct() {
        return NameOfProduct;
    }
}
