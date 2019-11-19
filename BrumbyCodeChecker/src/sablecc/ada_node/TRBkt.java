/* This file was generated by SableCC (http://www.sablecc.org/). */

package sablecc.ada_node;

import sablecc.ada_analysis.*;

@SuppressWarnings("nls")
public final class TRBkt extends Token
{
    public TRBkt()
    {
        super.setText("]");
    }

    public TRBkt(int line, int pos)
    {
        super.setText("]");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRBkt(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRBkt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRBkt text.");
    }
}
