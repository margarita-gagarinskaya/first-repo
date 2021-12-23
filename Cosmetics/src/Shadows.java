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

    public void setCodeAndName(String nameOfProduct, String codOfProduct) {
        this.setShadowProductCode(nameOfProduct);
        this.setShadowProductName(codOfProduct);
    }

    public String getShadowProductCode() {
        return shadowProductCode;
    }

    public String getShadowProductName() {
        return shadowProductName;
    }
}

