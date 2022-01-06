public class Strings {

    public static String changeString(String oldText) {
        int leng = oldText.length();
        System.out.printf("Длина входящей строки: %d\n", oldText.length());
        int i = leng;
        do{
            String replText = oldText.replace ("а", "1");
            String replText1 = replText.replace ("е", "6");
            String replText2 = replText1.replace ("ё", "7");
            String replText3 = replText2.replace ("и", "10");
            String replText4 = replText3.replace ("o", "16");
            String replText5 = replText4.replace ("у", "21");
            String replText6 = replText5.replace ("ы", "29");
            String replText7 = replText6.replace ("э", "31");
            String replText8 = replText7.replace ("ю", "32");
            String replText9 = replText8.replace ("я", "33");
            i--;
        }
        while (i > 0);
        return oldText;
    }
}
