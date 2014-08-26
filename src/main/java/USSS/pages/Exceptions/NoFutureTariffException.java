package USSS.pages.Exceptions;

public class NoFutureTariffException extends RuntimeException{
    public NoFutureTariffException(String message) {
        super(message);
    }
}
