/* This file was generated by SableCC (http://www.sablecc.org/). */

package sablecc.ada_node;

import sablecc.ada_analysis.*;

@SuppressWarnings("nls")
public final class TAbstract extends Token
{
    public TAbstract()
    {
        super.setText("Abstract");
    }

    public TAbstract(int line, int pos)
    {
        super.setText("Abstract");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAbstract(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAbstract(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAbstract text.");
    }
}
