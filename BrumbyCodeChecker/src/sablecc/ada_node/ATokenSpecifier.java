/* This file was generated by SableCC (http://www.sablecc.org/). */

package sablecc.ada_node;

import sablecc.ada_analysis.*;

@SuppressWarnings("nls")
public final class ATokenSpecifier extends PSpecifier
{

    public ATokenSpecifier()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new ATokenSpecifier();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATokenSpecifier(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
