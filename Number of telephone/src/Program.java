import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

    public static void main(String[] args) {
        String inputText = """
         Чтобы при клике на +79624485244 начинался звонок нужно навесить на них ссылки.
         Ссылка, которую нужно задать тексту с tel: +71234567855 (все без пробела).
         Будет работать при просмотре сайта на телефоне.
         Например, выбираете блок меню ME301, во вкладке
         Контент в поле Дополнительно указываете +79632287466,
         затем выделяете его и с помощью выпадающей панели инструментов для
         текста добавляете ссылку вида tel: +71234568477.
         """;
        String searchCode="((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}";

        String g = NumberOfTelephone.AssertSearchAndOutput(inputText, searchCode);
        String outputText = NumberOfTelephone.searchAndOutput(inputText, searchCode);

        String AssertOutputText = NumberOfTelephone.AssertSearchAndOutput(outputText, searchCode);
        String expectedResult= "Номера телефонов успешно изменены.";
        if(AssertOutputText.equals(expectedResult))
            System.out.println(
                    "Программа выполнена успешно"
            );
        //1 вар "(\\+*\\d{1}|d{2}\\s*|-*)(\\s*\\(*|-*|d{3}|\\s*\\)*|-*)(\\s*|-*|d{3})(\\s*|-*|d{2})(\\s*|-*|d{2})";
        //2 вар "(\\+*\\d{1,2}\\s*|-*)(\\(*|-*|\\d{3}|\\s*\\)*|-*)(\\d{3})(\\s*|-*|\\d{2})(\\s*|-*\\d{2})
        //+7(xxx)xxxxxxx
        //+7(xxx)-xxx-xx-xx
        //+7xxxxxxxxxx
        //+7xxx-xxx-xx-xx
        //+7-xxx-xxx-xx-xx
        //+xxx-xxx-xx-xx
        //x xx-xxx-xx-xx
        // \+*\d{1,2}\s*|-*\(*|-*|\d{3}|\s*\)*|-*\d{3}\s*|-*|\d{2}\s*|-*\d{2}
    }
}
