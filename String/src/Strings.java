public class Strings {

    public static String changeString(String oldText) {
        System.out.printf("Длина входящей строки: %d\n", oldText.length());
        String replText = oldText.replace ("а", "1");
        String replText1 = replText.replace ("е", "2");
        String replText2 = replText1.replace ("ё", "3");
        String replText3 = replText2.replace ("и", "4");
        String replText4 = replText3.replace ("о", "5");
        String replText5 = replText4.replace ("у", "6");
        String replText6 = replText5.replace ("ы", "7");
        String replText7 = replText6.replace ("э", "8");
        String replText8 = replText7.replace ("ю", "9");

        return replText8.replace ("я", "10");
    }
}
