public class Program {
    public static void main(String[] args) {
        final String TYPE1 = "(Декоративная)";
        final String TYPE2 = "(Уходовая)";

        Cosmetic Revolution = new Cosmetic("Revolution "+TYPE1,"China"); // создание объекта бренд Revolution
        Revolution.displayInfo();

        Cosmetic NIVEA = new Cosmetic(); // создание объекта бренд NIVEA
            //NIVEA.setPrice(150);
            NIVEA.setNameBrand("NIVEA "+TYPE2);
            NIVEA.setCountry("Germany");
            NIVEA.displayInfo();

        Decorative Memo = new Decorative();
        //1 способ:
        Memo.Information();
        System.out.println(Memo.getInfo());
        //2 способ: вывод информации через переменную
        //Memo.Information();
        //String S = Memo.getInfo(); //в переменной S результат отработки метода
        //System.out.println(S);

     }
}

