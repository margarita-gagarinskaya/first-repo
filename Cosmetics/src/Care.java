public class Care extends Cosmetic {

    protected String info;

    public Care() {
        //конструктор по умолчанию
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void displayInfoAboutCare() {
        this.setInfo("""
                Уходовая косметика предназначена для ухода за кожей лица,
                тела, ногтями и волосами. Она создана для поддержания красоты
                и молодости кожи, а также для решения различных косметических
                проблем – от повышенной жирности до преждевременного старения.
                """);
    }

    public String getInfo() {
        return info;
    }
}
