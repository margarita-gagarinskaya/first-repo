import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authorization{

    public static boolean verification (String login, String password, String confirmPassword) {

        try {
            Pattern patternLog = Pattern.compile("\\W");
            Matcher matcherLog = patternLog.matcher(login);
            Pattern patternPas = Pattern.compile("\\W");
            Matcher matcherPas = patternPas.matcher(password);
            if (matcherLog.find() & matcherPas.find()) {
                throw new WrongPasswordException("В логине и пароле используются иные символы кроме латиницы, цыфр и нижнего подчеркивания");
            }

            if (login.length()>20){
                throw new WrongLoginException("Введите логин менее 20 символов");
            }
                Pattern patternLogin = Pattern.compile("\\W");
                Matcher matcherLogin = patternLogin.matcher(login);
                if (matcherLogin.find()) {
                    throw new WrongLoginException("Не используйте иные символы в логине кроме латиницы, цыфр, нижнего подчеркивания");
                }
            System.out.println("Логин введен успешно");

            if (password.length()>20){
                throw new WrongPasswordException("Пароль должен быть меньше 20 символов");
            }
            Pattern patternPassword = Pattern.compile("\\W");
            Matcher matcherPassword = patternPassword.matcher(password);
            if (matcherPassword.find()) {
                throw new WrongPasswordException("Не используйте иные символы в пароле кроме латиницы, цыфр и нижнего подчеркивания");
            }
            if (password.equals(confirmPassword)){
                System.out.println("Пароль введен успешно, пароли совпадают");
            }
            else {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        }
        catch (WrongLoginException|WrongPasswordException e) {
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