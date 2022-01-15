import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authorization{

    public static boolean verification (String login, String password, String confirmPassword) {

        try {
            if (login.length()>20){
                throw new WrongLoginException("Введите логин менее 20 символов");
            }
                Pattern pattern = Pattern.compile("\\W");
                Matcher matcher = pattern.matcher(login);
                if (matcher.find()) {
                    throw new WrongLoginException("Не используйте иные символы кроме латиницы, цыфр, нижнего подчеркивания");
                }
            System.out.println("Логин введен успешно");
        }
        catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}


//        Создать статический метод который принимает на вход три параметра:
//  login, password и confirmPassword.
//        Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//  Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
//  необходимо выбросить WrongLoginException.
//        Password должен содержать только латинские буквы, цифры и знак подчеркивания.
// Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
//        Если password не соответствует этим требованиям, необходимо
// выбросить WrongPasswordException.
//        WrongPasswordException и WrongLoginException -
// пользовательские классы исключения с двумя конструкторами – один по умолчанию,
// второй принимает сообщение исключения и передает его в конструктор класса Exception.
//        Обработка исключений проводится внутри метода.
//        Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае.