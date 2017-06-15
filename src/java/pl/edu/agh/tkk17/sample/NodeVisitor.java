package pl.edu.agh.tkk17.sample;

import pl.edu.agh.tkk17.sample.nodes.NodeAdd;
import pl.edu.agh.tkk17.sample.nodes.NodeMul;
import pl.edu.agh.tkk17.sample.nodes.NodeNumber;

public interface NodeVisitor
{
    public void visit(NodeAdd node);
    public void visit(NodeMul node);
    public void visit(NodeNumber node);
}
