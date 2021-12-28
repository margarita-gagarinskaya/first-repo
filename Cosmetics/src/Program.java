public class Program {

    public static void main(String[] args) {

        final String TYPE1 = "(Декоративная)";
        final String TYPE2 = "(Уходовая)";

        //Создание объекта для класса Cosmetic 1 способ
        Cosmetic Revolution = new Cosmetic("Revolution "+TYPE1,"China"); // создание объекта бренд Revolution
        Revolution.displayNameAndCountry();

        //Создание объекта для класса Cosmetic 2 способ
        Cosmetic NIVEA = new Cosmetic(); // создание объекта бренд NIVEA
            //NIVEA.setPrice(150);
            NIVEA.setNameBrand("NIVEA "+TYPE2);
            NIVEA.setCountry("Germany");
            NIVEA.displayNameAndCountry();

        //Создание информационной справки про декоративную косметику
        Decorative Memo1 = new Decorative();
        //1 способ:
        Memo1.displayInfoAboutDecorative();
        System.out.println();
        System.out.println(Memo1.getInfo());
        //2 способ: вывод информации через переменную

        //Создание информационной справки про уходувую косметику
        Care Memo2 = new Care();
        Memo2.displayInfoAboutCare();
        System.out.println(Memo2.getInfo());
        System.out.println("_________________________");

        //Создание объекта класса Тени
        String shadowProductName="Тени"+"|";
        String shadowProductCode="01"+"|";
        Shadows Shad = new Shadows();
        System.out.print("Код продукта: " + shadowProductCode + " " + "Наименование продукта: "+ shadowProductName+" " );
        Revolution.displayNameAndCountry();
        System.out.println("_________________________");

        //Наполнение информацией про класс Глиттерные тени
        Glitters GLi1 = new Glitters();
        GLi1.setShadowProductCode("01");
        GLi1.setShadowProductName("Тени");
        GLi1.setNameBrand("NYX"+TYPE1);
        GLi1.setCountry("США");
        GLi1.setPrice(1150);
        GLi1.setTone("Глиттер");
        GLi1.setNumberOfColor(5);
        GLi1.displayFullInfoAboutGlitters();
        System.out.println("_________________________");

        //Создание объекта класса Для волос
        String hairProductCod="03"+"|";
        String hairProductName="Средства для волос"+"|";
        Hair Hai = new Hair();
        System.out.print("Код продукта: " + hairProductCod + " " + "Наименование продукта: "+ hairProductName+" " );
        NIVEA.displayNameAndCountry();
        System.out.println("_________________________");

        //Наполнение информацией про класс Шампунь
        Shampoo Sham = new Shampoo();
        Sham.setHairProductCod("03");
        Sham.setHairProductName("Шампунь");
        Sham.setNameBrand("Dove"+TYPE2);
        Sham.setCountry("Великобритания");
        Sham.setPrice(279);
        Sham.setScalpType("комбинированная");
        Sham.displayFullInfoAboutShampoo();
        System.out.println("_________________________");

        //работа с Интерфейсами//
        // создание объекта люксовый бренд Chanel
        Cosmetic Chanel = new Cosmetic();
        Chanel.setNameBrand("Chanel - "+ ILuxury.CATEGORY + ".");
        Chanel.setCountry("France");
        System.out.println("\n");
        System.out.println("Интерфейс для класа Cosmetic ниже");
        Chanel.displayLuxuryBrand();
    }
}

