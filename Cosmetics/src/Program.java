public class Program {
    public static void main(String[] args) {
        final String TYPE1 = "(Декоративная)";
        final String TYPE2 = "(Уходовая)";

        //Создание объекта для класса Cosmetic 1 способ
        Cosmetic Revolution = new Cosmetic("Revolution "+TYPE1,"China"); // создание объекта бренд Revolution
        Revolution.displayInfo();

        //Создание объекта для класса Cosmetic 2 способ
        Cosmetic NIVEA = new Cosmetic(); // создание объекта бренд NIVEA
            //NIVEA.setPrice(150);
            NIVEA.setNameBrand("NIVEA "+TYPE2);
            NIVEA.setCountry("Germany");
            NIVEA.displayInfo();

        //Создание информационной справки про декоративную косметику
        Decorative Memo1 = new Decorative();
        //1 способ:
        Memo1.Information1();
        System.out.println();
        System.out.println(Memo1.getInfo());
        //2 способ: вывод информации через переменную
        //Memo.Information();
        //String S = Memo.getInfo(); //в переменной S результат отработки метода
        //System.out.println(S);

        //Создание информационной справки про уходувую косметику
        Care Memo2 = new Care();
        Memo2.Information_2();
        System.out.println(Memo2.getInfo());
        System.out.println("_________________________");

        //Создание объекта класса Тени
        Shadows Shad = new Shadows();
        Shad.Sh();
        System.out.print(Shad.getCodOfProduct() + " " + Shad.getNameOfProduct()+" " );
        Revolution.displayInfo();
        System.out.println("_________________________");

        //Наполнение информацией про класс Глиттерные тени
        Glitters GLi1 = new Glitters();
        GLi1.setCodOfProduct("01");
        GLi1.setNameOfProduct("Тени");
        GLi1.setNameBrand("NYX"+TYPE1);
        GLi1.setCountry("США");
        GLi1.setPrice(1150);
        GLi1.setTone("Глиттер");
        GLi1.setNumberOfColor(5);
        GLi1.display();
        System.out.println("_________________________");

        //Создание объекта класса Для волос
        Hair Hai = new Hair();
        Hai.Ha();
        System.out.print("Код продукта: " + Hai.getCodOfProduct() + " " + "|Наименование продукта: "+ Hai.getNameOfProduct()+" " );
        NIVEA.displayInfo();
        System.out.println("_________________________");

        //Наполнение информацией про класс Шампунь
        Shampoo Sham = new Shampoo();
        Sham.setCodOfProduct("03");
        Sham.setNameOfProduct("Шампунь");
        Sham.setNameBrand("Dove"+TYPE2);
        Sham.setCountry("Великобритания");
        Sham.setPrice(279);
        Sham.setScalpType("комбинированная");
        Sham.display();
        System.out.println("_________________________");

    }
}

