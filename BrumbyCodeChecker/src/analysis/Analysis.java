/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTLParen(TLParen node);
    void caseTRParen(TRParen node);
    void caseTKeyword(TKeyword node);
    void caseTBlank(TBlank node);
    void caseTIdentifier(TIdentifier node);
    void caseTTraditionalComment(TTraditionalComment node);
    void caseTDocumentationComment(TDocumentationComment node);
    void caseTEndOfLineComment(TEndOfLineComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
