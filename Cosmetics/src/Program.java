public class Program {
    public static void main(String[] args) {

        Cosmetic Revolution = new Cosmetic("Revolution","China"); // создание объекта бренд Revolution
            Revolution.displayInfo();
        Cosmetic NIVEA = new Cosmetic(); // создание объекта бренд NIVEA
            //NIVEA.setPrice(150);
            NIVEA.setNameBrand("NIVEA");
            NIVEA.setCountry("Germany");
            NIVEA.displayInfo();
       }
}

