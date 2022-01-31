public class Hair extends Care {

    protected String hairProductName;
    protected String hairProductCode;

    public Hair() {
        //конструктор по умолчанию
    }

    public void setHairProductName(String hairProductName) {
        this.hairProductName = hairProductName;
    }

    public void setHairProductCode(String hairProductCode) {
        this.hairProductCode = hairProductCode;
    }

    public void setCodeAndName(String nameOfProduct, String codOfProduct) {
        this.setHairProductCode(nameOfProduct);
        this.setHairProductName(codOfProduct);
    }
    public void displayLuxuryBrand() {
         System.out.printf("Код: %s\tНазвание: %s \n", hairProductCode,  hairProductName);
    }


//    public String getCodOfProduct() {
//        return codOfProduct;
//    }
//
//    public String getNameOfProduct() {
//        return nameOfProduct;
//    }
}
