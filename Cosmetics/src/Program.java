public class Program {
    public static void main(String[] args) {

        Cosmetic Revolution = new Cosmetic("Revolution","China"); // создание объекта бренд Revolution
            Revolution.setPrice(500);
            //Revolution.setCountry("China");
            Revolution.displayInfo();
        Cosmetic NIVEA = new Cosmetic("NIVEA","Germany"); // создание объекта бренд NIVEA
            NIVEA.setPrice(150);
            NIVEA.setCountry("Germany");
            NIVEA.displayInfo();
       }
}

