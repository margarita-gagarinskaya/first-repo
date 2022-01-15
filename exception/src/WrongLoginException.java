public class WrongLoginException extends Exception {

    //конструктор
    public WrongLoginException(String message) {
        super(message);
    }
}

//        Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//  Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
//  необходимо выбросить WrongLoginException.