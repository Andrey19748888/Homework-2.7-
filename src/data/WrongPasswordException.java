package data;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {          // у конструктора всегда такое же название как и у класса
        super(message);
    }
}
