/* This file was generated by SableCC (http://www.sablecc.org/). */

package sablecc.ada_node;

import sablecc.ada_analysis.*;

@SuppressWarnings("nls")
public final class ASetBasic extends PBasic
{
    private PSet _set_;

    public ASetBasic()
    {
        // Constructor
    }

    public ASetBasic(
        @SuppressWarnings("hiding") PSet _set_)
    {
        // Constructor
        setSet(_set_);

    }

    @Override
    public Object clone()
    {
        return new ASetBasic(
            cloneNode(this._set_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASetBasic(this);
    }

    public PSet getSet()
    {
        return this._set_;
    }

    public void setSet(PSet node)
    {
        if(this._set_ != null)
        {
            this._set_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._set_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._set_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._set_ == child)
        {
            this._set_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._set_ == oldChild)
        {
            setSet((PSet) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
