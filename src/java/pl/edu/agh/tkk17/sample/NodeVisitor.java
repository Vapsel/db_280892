package pl.edu.agh.tkk17.sample;

import pl.edu.agh.tkk17.sample.nodes.*;

public interface NodeVisitor
{
    public void visit(NodeAdd node);
    public void visit(NodeMul node);
    public void visit(NodeSub node);
    public void visit(NodeDiv node);
    public void visit(NodeNumber node);
}
