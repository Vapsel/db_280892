package pl.edu.agh.tkk17.sample;

import pl.edu.agh.tkk17.sample.exceptions.OutputableException;
import pl.edu.agh.tkk17.sample.nodes.Node;

public class Compiler
{
    public static void main(String []args)
    {
        try {
            Scanner scanner = new Scanner(System.in);
            Node tree = Parser.parse(scanner);
            Generator.generate(tree, System.out);
        } catch (OutputableException e) {
            String message = e.getMessage();
            System.err.println("Compilation failed. " + message);
        }
    }
}
