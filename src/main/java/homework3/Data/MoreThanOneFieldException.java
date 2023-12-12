package homework3.Data;

public class MoreThanOneFieldException extends RuntimeException{
    public MoreThanOneFieldException(String field)
    {
        super("More than one field with "+field);
    };
}
