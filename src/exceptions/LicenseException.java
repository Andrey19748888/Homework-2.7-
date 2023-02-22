package exceptions;

public class LicenseException extends Exception {

    @Override
    public String toString() {
        return "Права не соответствуют!";
    }
}
