package pl.edu.agh.tkk17.sample.exceptions;

public class DivisionByZeroException extends OutputableException {

    public DivisionByZeroException(){

        super("Division by 0.");
    }
}
