public class Shadows extends Decorative {

    protected String shadowProductName;
    protected String shadowProductCode;

    public Shadows() {
        //конструктор по умолчанию
    }

    public void setShadowProductName(String shadowProductName) {
        this.shadowProductName = shadowProductName;
    }

    public void setShadowProductCode(String shadowProductCode) {
        this.shadowProductCode = shadowProductCode;
    }

    public void setCodeAndName(String codOfProduct, String nameOfProduct) {
        this.setShadowProductCode(codOfProduct);
        this.setShadowProductName(nameOfProduct);
    }

    public String getShadowProductCode() {
        return shadowProductCode;
    }

    public String getShadowProductName() {
        return shadowProductName;
    }

     public void displayLuxuryBrand() {
         System.out.printf("Код: %s\tНазвание: %s \n", shadowProductCode, shadowProductName);
    }
}

