package pl.edu.agh.tkk17.sample.exceptions;

import java.io.IOException;

public class UncheckedIOException extends OutputableException
{
    public UncheckedIOException(String message, IOException cause)
    {
        super(message, cause);
    }
}
