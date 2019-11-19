/* This file was generated by SableCC (http://www.sablecc.org/). */

package sablecc.ada_node;

import sablecc.ada_analysis.*;

@SuppressWarnings("nls")
public final class TDecChar extends Token
{
    public TDecChar(String text)
    {
        setText(text);
    }

    public TDecChar(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDecChar(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDecChar(this);
    }
}
