import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfTelephone {

    public static String searchAndOutput (String inputText, String searchCode){
        Pattern pattern = Pattern.compile(searchCode);    //создание объекта Pattern с помощью статического метода compile(), который позволяет установить шаблон
        Matcher matcher = pattern.matcher(inputText);
        String coincidence="gi";
        String change = "(Номер телефона)";
        while(matcher.find()) {                          //возвращает true, если в строке есть подстрока, которая совпадает с шаблоном, и переходит к этой подстроке
            coincidence=matcher.replaceAll(change);
                    }
        return coincidence;

    }

    public static String AssertSearchAndOutput (String inputText, String searchCode){
        Pattern pattern = Pattern.compile(searchCode);    //создание объекта Pattern с помощью статического метода compile(), который позволяет установить шаблон
        Matcher matcher = pattern.matcher(inputText);
        String coincidence="Номера телефонов успешно изменены.";
        String anti = "";
        while(matcher.find()) {                          //возвращает true, если в строке есть подстрока, которая совпадает с шаблоном, и переходит к этой подстроке
            anti= anti+matcher.group();
        }
        if (!anti.equals("")){
            coincidence=anti;
        }
        return coincidence;

    }
}
