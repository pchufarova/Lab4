package exceptions;

public class NegativeCoefficientException extends RuntimeException {

    public NegativeCoefficientException() { super("Коэффициент не может быть отрицательным."); }

}
