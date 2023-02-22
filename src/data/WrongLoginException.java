package data;

public class WrongLoginException extends Exception{

    public WrongLoginException() {

    }


    public WrongLoginException(String message) {          // у конструктора всегда такое же название как и у класса
        super(message);
    }
}
