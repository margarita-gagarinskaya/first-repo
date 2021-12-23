public class Hair extends Care {

    protected String hairProductName;
    protected String hairProductCod;

    public Hair() {
        //конструктор по умолчанию
    }

    public void setHairProductName(String hairProductName) {
        this.hairProductName = hairProductName;
    }

    public void setHairProductCod(String hairProductCod) {
        this.hairProductCod = hairProductCod;
    }

    public void setCodeAndName(String nameOfProduct, String codOfProduct) {
        this.setHairProductCod(nameOfProduct);
        this.setHairProductName(codOfProduct);
    }

//    public String getCodOfProduct() {
//        return codOfProduct;
//    }
//
//    public String getNameOfProduct() {
//        return nameOfProduct;
//    }
}
