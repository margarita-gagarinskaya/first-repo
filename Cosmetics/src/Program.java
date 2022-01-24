import java.util.HashSet;
public class Program {

    public static void main(String[] args) {

        final String TYPE1 = "(Декоративная)";
        final String TYPE2 = "(Уходовая)";

        //Создание объекта для класса Cosmetic 1 способ
        Cosmetic Revolution = new Cosmetic("Revolution "+TYPE1,"China"); // создание объекта бренд Revolution
        Revolution.displayInfoAboutDecorative();

        //Создание объекта для класса Cosmetic 2 способ
        Cosmetic NIVEA = new Cosmetic(); // создание объекта бренд NIVEA
            //NIVEA.setPrice(150);
            NIVEA.setNameBrand("NIVEA "+TYPE2);
            NIVEA.setCountry("Germany");
            NIVEA.displayInfoAboutDecorative();

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
        Revolution.displayInfoAboutDecorative();
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
        NIVEA.displayInfoAboutDecorative();
        System.out.println("_________________________");

        //Наполнение информацией про класс Шампунь
        Shampoo Sham = new Shampoo();
        Sham.setHairProductCode("03");
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

        //создание объекта люксовый декоративный бренд Кайли Косметикс
        Decorative KylieCosmetics = new Decorative();
        KylieCosmetics.setNameBrand("KylieCosmetics - "+ ILuxury.CATEGORY + ".");
        KylieCosmetics.setProductOfBrand("Kylie Lip Kits, Тени");
        System.out.println("\n");
        System.out.println("Интерфейс для класа Decorative ниже");
        KylieCosmetics.displayLuxuryBrand();

        ILuxury Eda = new Product();
        Cosmetic Decor = new Decorative();
        Product Eda1 = new Product();
        Shop.method(Eda);
        Shop.method(KylieCosmetics);
        Shop.method(Eda1);

        //создание объекта люксовый уходовый бренд Кайли Скин
        Care KylieSkin = new Care();
        KylieSkin.setNameBrand("KylieSkin - "+ ILuxury.CATEGORY + ".");
        KylieSkin.setProductOfBrand("KYLIE SKIN SET WITH BAG, PREP THOSE PORES BUNDLE");
        System.out.println("\n");
        System.out.println("Интерфейс для класа Care ниже");
        KylieSkin.displayLuxuryBrand();

        //создание объекта люксовые тени
        Shadows HudaBeauty = new Shadows();
        HudaBeauty.setNameBrand("HudaBeauty - "+ ILuxury.CATEGORY + ".");
        HudaBeauty.setShadowProductCode("0123");
        HudaBeauty.setShadowProductName("COLLECTION ROSE GOLD REMASTERED Палетка теней");
        System.out.println("\n");
        System.out.println("Интерфейс для класа Shadows ниже");
        HudaBeauty.displayLuxuryBrand();

        //создание объекта люксовые средства для волос
        Hair CP1 = new Hair();
        CP1.setNameBrand("CP-1 - "+ ILuxury.CATEGORY + ".");
        CP1.setHairProductCode("05678");
        CP1.setHairProductName("Bright complex Intense Nourishing Shampoo Version 2.0");
        System.out.println("\n");
        System.out.println("Интерфейс для класа Hair ниже");
        CP1.displayLuxuryBrand();

        //создание объекта люксовые тени от Huda
        Glitters LuxHuda = new Glitters();
        LuxHuda.setShadowProductCode("519624");
        LuxHuda.setShadowProductName("HAZE OBSESSIONS");
        LuxHuda.setNameBrand("Huda Beauty "+TYPE1 +" "+ ILuxury.CATEGORY + ".");
        LuxHuda.setCountry("США, Германия, ОАЭ");
        LuxHuda.setPrice(2660);
        LuxHuda.setTone("Sand");
        LuxHuda.setNumberOfColor(9);
        LuxHuda.setProductDescription("""
        Коллекция палеток теней для век для создания более деликатного варианта макияжа в технике smoky eye,
        каждая из трех палеток превосходно сочетается с любым типом внешности.
        Каждая палетка составлена таким образом, что с ее помощью можно создать бесконечное количество макияжей:
        подсветить, создать растушеванную стрелку или просто подчеркнуть форму глаз. От расслабленного шика до ярких вечерних.
        Что вам еще нужно знать: Создайте современный вариант smoky eye с использованием оттенков теней из коллекции:
        Haze – мягкие матовые оттенки, насыщенные металлик и светящиеся оттенки для нанесения поверх базовых оттенков теней.
        """);
        System.out.println("\n");
        System.out.println("Интерфейс для класа Glitters ниже");
        LuxHuda.displayLuxuryBrand();
        System.out.println("_________________________");

        //люксовый шампунь от СР-1
        Shampoo LuxCP1 = new Shampoo();
        LuxCP1.setHairProductCode("003");
        LuxCP1.setHairProductName("Шампунь УВЛАЖНЯЮЩИЙ протеиновый CP-1 интенсивное питание для волос 500мл");
        LuxCP1.setNameBrand("CP-1"+TYPE2);
        LuxCP1.setCountry("Южная Корея");
        LuxCP1.setPrice(1290);
        LuxCP1.setScalpType("сухая");
        LuxCP1.setProductDescription("""
                Популярный и проверенный временем безсульфатный шампунь, недавно получивший новую,
                усиленную формулу. Комплекс из протеинов, кератина, шёлка, коллагена и растительных
                экстрактов отлично очищает волосы, питает их, делает эластичными и послушными.
                Увлажняет и обволакивает каждый волос, что защищает его внешних агрессивных воздействий,
                таких как жара и сухость, загрязненный городской воздух.
                Ментол в составе шампуня улучшает микроциркуляцию в коже головы и обеспечивает эффективную
                транспортировку активных ингредиентов к корням волос.

                Обладает приятной консистенцией, образует густую пену и придает волосам легкий аромат
                спелых фруктов со свежей ноткой ментола.
                """);
        System.out.println("\n");
        System.out.println("Интерфейс для класа Shampoo ниже");
        LuxCP1.displayLuxuryBrand();
        System.out.println("_________________________");

        UpdateCosmetic.updateData(NIVEA, "25").displayInfoAboutDecorative();
        System.out.println("_________________________");

        //слияние двух объектов
        Glitters GLiti = new Glitters();
        GLiti.setNameBrand("Tati");
        GLiti.setCountry("США");
        GLiti.setTone("Глиттер");
        //____//
        Glitters Satin = new Glitters();
        Satin.setNameBrand("HUDA");
        Satin.setCountry("США");
        Satin.setTone("Сатин");
        //____//
        Cosmetic L = UpdateCosmetic.joinTwoObject(GLiti, NIVEA);
        L.displayInfoAboutDecorative();
        System.out.println("_________________________");

        //1 со 2, 2 с 1
        Cosmetic[] Cos1 = new Cosmetic[4];
        Cos1[0]=new Cosmetic("a","1");
        Cos1[1]=new Cosmetic("b","2");
        Cos1[2]=new Cosmetic("c","3");
        Cos1[3]=new Cosmetic("d","4");
        UpdateCosmetic.joinPairObject(Cos1);


//        for(Cosmetic c : Cos1){
//            System.out.printf("Бренд: %s |\tСтрана производитель: %s\n", c.getNameBrand(), c.getCountry());
//        }
    }
}

